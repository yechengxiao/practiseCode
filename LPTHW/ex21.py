def add(a,b):
    print "ADDING %s+%s" %(a,b)
    return a+b

def subtract(a,b):
    print "SUBTRACTING %s-%s" %(a,b)
    return a-b

def multiply(a,b):
    print "MULTIPLYING %s*%s" %(a,b)
    return a*b

def divide(a,b):
    print "DIVIDING %s/%s" %(a,b)
    return a/b

print "Let's do some math with just funcitns!"

age=add(30,5)
height=subtract(78,4)
weight=multiply(90,2)
iq=divide(100,2)

print "Age: %s, Height:%s, Weight:%s, IQ:%s"%(age,height,weight,iq)

# A puzzle for the extra credit,type it in anyway.
print "Here is a puzzle."

what=add(age,subtract(height,multiply(weight,divide(iq,2))))

print "That becomes: " ,what," Can you do it by hand?"

aa=raw_input("input a number")
bb=raw_input("input a number")
print add(float(aa),float(bb))

print 20+34/2-100
