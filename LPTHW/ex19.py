#-*-coding:utf8-*-
#函数和变量

def cheese_and_crackers(cheese_count,boxes_of_crackers):
    print "You have %d cheeses!" %cheese_count
    print "You have %d boxes of crackers!" %boxes_of_crackers
    print "Man that's enough for a party!"
    print "Get a blanket.\n"

print "We can just five the function numbers directly:"
cheese_and_crackers(20,30)


print "OR, we can use variables form our script:"
amount_of_cheese = 10
amount_of_crackers = 50

cheese_and_crackers(amount_of_cheese,amount_of_crackers)


print "We can even do math inside too:"
cheese_and_crackers(10+20,5+7)


print "And we can combine the two ,variables and math:"
cheese_and_crackers(amount_of_cheese+100,amount_of_crackers+1000)


num1=raw_input("Please input 1 number")
num2=raw_input("Please input 1 number")
cheese_and_crackers(int(num1),int(num2))
