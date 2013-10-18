# while-loop

i = 0 
numbers = []

while i < 6:
    print "At the top is %d" % i
    numbers.append(i)

    i+=1
    print "Numbers now:",numbers
    print "At the bottom is %d" % i

print "The numbers:"
for num in numbers:
    print num


def while_function(j):
    numbers = []
    a = 0

    while(a < j):
	print "At the top is %d" % a
	numbers.append(a)

	a+=1
	print "numbers now:",numbers # print list
	print "At the bottom is %d" % a

while_function(10)
