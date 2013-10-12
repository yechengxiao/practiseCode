#-*-coding:utf8-*-
from sys import argv

script,filename=argv

print "We're goign to erase %r" %filename
print "If you don't want that,hit Ctrl-C"
print "If you do want that,hit enter"

raw_input("?")

print "Opening the file..."
target=open(filename,'w+')#what's the mean of w  除了 'w' 以外,我们还有 'r' 表示读取(read), 'a' 表示追加(append)。

#target.write("before truncate(),i can write()?")#文件原来的内容将被清空，那为何还要truncate()

print "Truncating the file.Goodbye!"
target.truncate()#erase file

print "Now I'm going to ask you for three lines."

line1=raw_input("line 1:")
line2=raw_input("line 2:")
line3=raw_input("line 3:")
 
print "I'm going to write these to the file."

target.write(line1+"\n")#write to file
target.write(line2+"\n")
target.write(line3+"\n")

print "And finally, we close it."
target.close()

#open() 'w+', 'r+', 'a+' ——这样的话文件将以同时读写的方式打 
#开,而对于文件位置的使用也有些不同。
#'w+',试了一下，没法读
txt=open("ex15_sample")
print txt.read()
txt.close()


#do again by myself
#from sys import argv 
#
#scritps,filename=argv
#
#print "now , going to erase %r" %filename
#print "if you want to interrupt,hit ctrl+c"
#print "if you do want to go on, hit enter"
#
#raw_input("what's your choice ?")
#
#target=open(filename,'w')
#
#print "going to erase file"
#target.truncate()
#
#print "now,the file is erased"
#print "you can input something now"
#
#line=raw_input()
#
#target.write(line)
#
#target.close()
