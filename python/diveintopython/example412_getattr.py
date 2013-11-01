#coding:utf8
import statsout

def output(data, format = "text"):
    output_function = getattr(statsout, "output_%s" % format) # 执行函数的引用
    return output_function(data)
