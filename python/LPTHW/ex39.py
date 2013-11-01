# -*-coding:utf8-*-

# list 是有序的
# things = ['a', 'b', 'c', 'd']
# print things
# print things[1]
# 
# things[1] = 'z'
# print 'after change thing[1]: %s ' % things[1]
# 
# # print list
# print things


# dictionary
stuff = {'name': 'Zed', 'age': 36, 'height': 6*12+2}

print "dict:stuff--> %s" % stuff
print stuff['name']
print stuff['age']
print stuff['height']

# add new element at head
stuff['city'] = "San francisco"
print stuff['city']

# print dict
print "dict:stuff--> %s" % stuff

# use num to add new element
# dict 是无序的
stuff[1] = "Wow" 
stuff[2] = "Neato"
print stuff[1]
print "dict:stuff--> %s" % stuff

# del 
del stuff['city']
del stuff[1]
del stuff[2]
print "dict:stuff--> %s" % stuff


for key_in_stuff, value_in_stuff in stuff.items():
    print "item in stuff : %s,%s" %(key_in_stuff,value_in_stuff)
