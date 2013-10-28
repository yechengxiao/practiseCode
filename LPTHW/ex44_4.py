# -*-coding:utf8-*-
# 覆盖的三种交互模式
class Parent(object):

    def override(self):
         print "PARENT override()"

    def implicit(self):
        print "PARENT implicit()"

    def altered(self):
        print "PARENT altered()"

class Child(Parent):

    def override(self): # 覆盖父类方法
        print "CHILD override()"
 
    def altered(self):  # 特殊的覆盖
        print "CHILD, BEFORE PARENT altered()"
	super(Child, self).altered()
	print "CHILD, AFTER PARENT altered()"

dad = Parent()
son = Child()

dad.implicit()
son.implicit()

dad.override()
son.override()

dad.altered()
son.altered()
