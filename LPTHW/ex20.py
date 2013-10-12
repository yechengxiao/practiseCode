#-*-coding:utf8-*-
#函数和文件
from sys import argv

script,input_file = argv

def print_all(f):
    print f.read()

def rewind(f):
    f.seek(0)#仅定位指针到文件的0byte

def print_a_line(line_count,f):
    print line_count,f.readline(),#加了，print就不会输出\n

current_file = open(input_file)

print "First let's print the whole file:\n"

print_all(current_file)

print "Now let's rewind,kind of like a tape."

rewind(current_file)

print "Let's print three lines:"

current_line=1
print_a_line(current_line,current_file)

current_line+=1#传递行号
print_a_line(current_line,current_file)

current_line=3
print_a_line(current_line,current_file)

current_file.close()
