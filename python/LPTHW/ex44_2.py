# -*-coding:utf8-*-
# 显示覆盖 Explicit Override
# 子类修改了父类中的方法实现
class Parent(object):
    
    def override(self):
        print "PARENT override()"


class Child(Parent):
    
    def override(self):
        print "CHILD override()"

ded = Parent()
son = Child()

ded.override()
son.override()
