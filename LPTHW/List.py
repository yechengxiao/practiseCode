print "counted %(count)d" %{"count":11}  #mapping


print "list:---------------------------------"

# list
starts = ['3','3:30','2','10:30','1:30','3','4:30','1:30','3','4:30']
ends = ['5PM','6:30PM','5PM','12NOON','3PM','4:30PM','6PM','3PM','4:30PM','6PM']

print "length:%s" %len(starts)
print starts[0]
print starts[:5] #from [0] to [4]? 


print "dictionary:---------------------------------"

# dictionary
d = {'5:30-7PM':5,'8:30-5:30PM':3,'9-10M':13,'7:30-10:30PM':4,'5:40-6PM':1,'6:30-8:30PM':25,'9-4:30PM':2,'7-10PM':16,'7-7PM':22}

print d['5:30-7PM']
d['5:30-7PM']+=1
print d['5:30-7PM']

print d.has_key('6-9PM') #return boolean 
