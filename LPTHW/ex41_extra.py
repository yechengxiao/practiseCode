#-*-coding:utf8-*-
## Animal is-a object (yew, sort of confusing) look at the extra credit

class Animal(object):
    pass

## ??
class Dog(Animal):

    def __init__(self, name):
        ## ??
	self.name = name

## ??
class Cat(Animal):

    def __init__(self, name):
        ## ??
	self.name = name

## ??
class Person(object):

    def __init__(self, name):
	## ??
	self.name = name

	## Person has-a pet of some kind
	self.pet = None

## 继承
class Employee(Person):

    def __init__(self, name, salary):
	## 调用父类的构造函数
	super(Employee, self).__init__(name)
	##??
	self.salary = salary

## ??
class Fish(object):
    pass

## ??
class Salmon(Fish):
    pass

## ??
class Halibut(Fish):
    pass

## rover is-a Dog
rover = Dog("Rover")
print "rover.name--> %s" %rover.name

## ??
satan = Cat("Satan")
print "satan.name--> %s" %satan.name

## ??
mary = Person("Mary")
print "mary.name--> %s" %mary.name
