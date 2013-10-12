#-*-coding:utf8-*-
#文件拷贝 将一个文件拷到另一个文件

#from sys import argv
#from os.path import exists
#
#script,from_file,to_file = argv
#
#print "Copying form %s to %s " %(from_file,to_file)
#
## we could do these two on one line too ,how?  ??
#
#in_file = open(from_file)
#indata = in_file.read()
#
#print "The input file is %d bytes long" %len(indata)
#
#print "Does the output file exist? %r " %exists(to_file)
#print "Ready, hit return to continue, ctrl+c to abort."
#raw_input()
#
#out_file=open(to_file,'w')
#out_file.write(indata)
#
#print "Alright,all done."
#
#out_file.close()
#in_file.close()

#to_file 不存在也没关系
from sys import argv
from os.path import exists

script,from_file,to_file = argv

print "from_file is %s ,to_file is %s" %(argv[1],argv[2])
in_file=open(from_file).read()#after read() file is close(),and return string object 
#read_in_file=in_file.read()

print "Is to_file exists? %s" %exists(to_file)

print "Begin to copy."
to_file=open(to_file,"w")
to_file.write(in_file)

print "Copy done."
to_file.close()
#in_file.close()
