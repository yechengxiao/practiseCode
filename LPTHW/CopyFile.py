#-*-coding:utf8-*-
#copy files to one file
from sys import argv

def receive_file(out):
    file_amount=len(argv)

    print "Total files are %s."%(file_amount-1)

    for i in range(1,file_amount): 
	from_file=argv[i]
	to_file=out

	copy_file(from_file,to_file)


def copy_file(from_file,to_file):
    print "form_file is %s , to_file is %s." %(from_file,to_file)

    in_file=open(from_file).read()

    print "Begin copy."
    out_file=open(to_file,'a')
    out_file.write("------------------------"+from_file+"------------------------\n"+in_file)
    print "Copy done."

    out_file.close()

output_file=raw_input("dest file:")

receive_file(output_file)
