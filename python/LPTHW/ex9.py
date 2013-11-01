# Here's sone new strange stuff, remember type it exactly.
days="Mon Tue Wed Thu Fri Sat Sun"
months="\nJan,Feb\nMar\nApr\nMay\nJun\nJul\nAug"

x="test print"
print "Here are the days: %s " %x

print "Here are the days:  ", days
print "Her are the months: ", months  #can't use %r

print """
There's something going on here.
With the three double-quotes.
We'll be able to type as much as we like.
Even 4 lines if we want, or 5, or 6.
"""
