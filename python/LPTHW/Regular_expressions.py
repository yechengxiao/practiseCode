import re

print "regular expression:---------------------------------"

one_class = '''
AAMW-521 HSE/AILLA/PAL HELLEN ROM    1 CU
401 SEM W 3:30-6:30pm          KUTTNER A      
CROSS LISTEN: ARTH-521 CLST-521
MAX 2/CROSS LIST:13
'''

# regular expression 1
def regex1(content):
    findtime = re.compile(r'(\d{1,2}:\d{1,2})')
    matches=findtime.findall(content)
    print matches

# regular expressin 2, uncomment the lines below to run it
def regex2(content):
    findinstructor = re.compile(r'(\w+[A-Z]\n)')
    matches = findinstructor.search(content)
    print matches.groups()

# regular expression 3, uncomment the lines below to run it 
def regex3(content):
    findtimeranges = re.compile(r'(\d{1,2}(:\d\d)?)-((\d{1,2}(:\d\d)?)(([AP]M)|NOON))')
    matches=findtimeranges.search(content)
    print matches.groups()

regex1(one_class)
# regex2(one_class)
# regex3(one_class)

