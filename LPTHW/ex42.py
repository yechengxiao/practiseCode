## Animal is-a object (yes, sort of confusing) look at the extra credit
class Animal(object):
    pass

## ?? Dog is-a Animal
class Dog(Animal):

    def __init__(self, name):
        ## ?? Dog has-a name
	self.name = name
	print "Dog name: %s " % self.name

class Big_Dog(Dog):
   
    def __init(self, name):
        super(Big_Dog, self).__init__(name) # super

## ?? Cat is-a Anima 
class Cat(Animal):
    
    def __init__(self, name):
        ## ?? Cat has-a name
	self.name = name

## ?? Person is-a object
class Person(object):
     
    def __init__(self, name):
         ## ?? Person has-a name
	 self.name = name

         ## Person has-a pet of some kind
	 self.pet = None

## ?? Employee is-a Person
class Employee(Person):

    def __init__(self, name,salary):
         ## ?? hmm what is this strange magic ?
	 super(Employee, self).__init__(name)
     	 ## ?? Employee has-a salary
	 self.salary = salary

## ?? Fish is-a object
class Fish(object):
    pass

## ?? Salmon is-a Fish
class Salmon(Fish):
    pass

## ?? Halibut is-a Fish
class Halibut(Fish):
    pass

## rover is-a Dog
rover = Dog("Rover")

big_dog = Big_Dog("big_dog")

## ?? satan is-a Cat
satan = Cat("Satan")

## ?? mary is-a Person
mary = Person("Mary")
