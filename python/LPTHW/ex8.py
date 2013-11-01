#-*-coding:utf-8-*-
formatter = "%s %r %r %r"#打印输出会有引号，但具体使用什么引号有python决定

print formatter % (1,2,3,4)#不是取模
print formatter % ("one","two","three","four")
print formatter % (True,False,False,True)
print formatter % (formatter,formatter,formatter,formatter)
print formatter % (
"I had this thing.",
'That you could type up right.',
"But it didn't sing.",
"So I said goodnight."
)
