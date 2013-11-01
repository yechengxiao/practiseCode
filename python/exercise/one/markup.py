import sys, re
from handler import *
from util import *
from rules import *

class Parser:
   '''
    语法分析器读取文本文件，应用规则并且控制处理程序
   '''

   def __init__(self, handler):
        self.handler = handler
	self.rules = []
	self.filters = []

   def addRule(self, rule):
        self.rules.apend(rule)

   def addFilter(self, pattern, name):
        def filter(block, handler):
	    return re.sub(pattern, handler.sub(name), block)
	self.filters.append(filter)   

   def parse(self, file):
        self.handler.start('document')
	for block in blocks(file):
	    for filter in self.filters:
		block = filter(block, self.handler)
            for rule in self.rules:
		if rule.condition(block):
		    last = rule.action(block, self.handler)
		    if last:
			break
        self.handler.end('document')	

class BasicTextParser(Parser):
    '''
    doc
    ''' 
    def __init__(self, handler):
        Parser.__init__(self, handler)
	self.addRule(ListRule())
	self.addRule(ListItemRule())
	self.addRule(TitleRule())
	self.addRule(HeadingRule())
	self.addRule(ParagrapRule())

        self.addFilter(r'\*(.*?)\*','emphasis')
	self.addFilter(r'(http://[\.a-zA-Z+)', 'url')
	self.addFIlter(r'([\.a-zA-Z]+@[].a-zA-Z]+[a-zA-Z])', 'mail')
	
handler = HTMLrenderer()
parser = BasicTextParser(handler)

parser.parse(sys.stdin)
