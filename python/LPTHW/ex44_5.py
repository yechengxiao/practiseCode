# -*-coding:utf8-*-
# 合成
class Other(object):
    
    def override(self):
        print "OTHER override()"

    def implicit(self):
        print "OTHER implicit()"

    def altered(self):
        print "OTHER altered()"

class Child(object):
    
    def __init__(self,str):
        self.other = Other() # star 合成
	self.str = str
	print 'str: %s' % self.str

    def implicit(self):
        self.other.implicit()
	 
    def override(self):
        print "CHILD override()"

    def altered(self):
        print "CHILD, BEFORE OTHER altered()"
	self.other.altered()
	print 'CHILD, AFTER OTHER altered()'

son = Child('hahaha')

son.implicit()
son.override()
son.altered()
