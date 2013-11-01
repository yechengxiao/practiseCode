#-*-coding:utf8-*-

# this one is like your scripts with argv
def print_two(*args):#Is *args Array?
    arg1,arg2 =args
    print "arg1: %r,arg2:%r" %(arg1,arg2)

# ok ,tha * args is actually pointless, we can just do this 
def print_two_again(arg1,arg2):
    print "arg1: %r,arg2: %r" %(arg1,arg2)


# this just takes one argument
def print_one(arg1):
    print "arg1: %r" %arg1

# this one takes no arguents
def print_none():
    print "I got nothin'." 


print_two("zed","shaw")
print_two_again("zed","shaw")
print_one("first!")
print_none()
