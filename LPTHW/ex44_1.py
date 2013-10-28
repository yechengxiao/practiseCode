# -*-coding:utf8-*-
# 隐式继承
# 子类中没有定义父类中的方法
class Parent(object):

    def implicit(self):
        print "PARENT implicit()"

class Child(Parent):
    pass

dad = Parent()
son = Child()

dad.implicit()
son.implicit()
