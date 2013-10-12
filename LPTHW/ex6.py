#-*-coding:utf-8-*-
x = "There are %d types of people." % 10
binary = "binary"
do_not = "don't"
y = "Those who konw %s and those who %s." %(binary,do_not) #多个变量

print x
print y

print "I said: %r." %x
print "I also said: '%s'." %y #star '%s'

hilarious = False
joke_evaluation = "Isn't that joke so funny?! %r" #star
print joke_evaluation %hilarious

w = "This is the left side of ... "
e = "a string with aright side."

print w + e
