# -*-coding:utf8-*-
# 这是覆盖的一个特例，在父类中定义的内容运行之前或之后再修改行为。
class Parent(object):
    
    def altered(self):
        print "PARENT altered()"

class Child(Parent):
    
    def altered(self):
        print "CHILD, BEFORE PARENT altered()"
	super(Child,self).altered() # star
	print "CHILD, AFTER PARENT altered()"

dad = Parent()
son = Child()

dad.altered()
son.altered()
