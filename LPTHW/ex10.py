#-*-coding:utf-8-*-
tabby_cat="\tI'm tabbed in."
persian_cat="I'm split\non a line."
backslash_cat="I'm \\ a \\ cat."

#单引号，双引号只是风格问题
fat_cat="""
I'll do a list:
\t* Cat food
\t* Fishies
\t* Catnip\n\t* Grass
"""


print "%r" %tabby_cat #%r 打印出来的是你作为程序员写在脚本里的东西
print tabby_cat
print persian_cat 
print backslash_cat
print fat_cat
