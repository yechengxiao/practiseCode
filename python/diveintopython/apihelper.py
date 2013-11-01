#coding:utf8
def info(object, spacing = 10, collapse = 1):
    '''
    print methods and doc strings.
    takes module, class, list, dictionary, or string.
    '''

    methodList = [method for method in dir(object) if callable(getattr(object, method))]
    # 将函数赋值给变量，然后通过引用变量调用函数
    processFunc = collapse and (lambda s: " ".join(s.split())) or (lambda s:s) # split()去掉空白，不仅仅是空格
    print "\n".join(["%s %s" % (method.ljust(spacing),
				 processFunc(str(getattr(object, method).__doc__))) # 使用str必不可少，str()必然会返回str对象,包括str(None)值
				    for method in methodList])

if __name__ == "__main__":
    print info.__doc__
