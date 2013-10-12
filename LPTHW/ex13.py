from sys import argv

#the thing which after python are argument variable,
#like"python ex13.py 1 2 3",ex13.py 1 2 3 are argument
script,first,second,third=argv

print "The script is called :",script
print "Your first variable is :",first
print "Your second variable is :",second
print "Your third variable is :",third

name=raw_input("input name: ")
print "\nthe name is %s" %name
