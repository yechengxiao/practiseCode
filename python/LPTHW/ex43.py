#-*-coding:utf8-*-
# 中断一下
import random
from urllib import urlopen
import sys

WORD_URL = "http://learncodethehardway.org/words.txt"
WORDS = []

PHRASES = {
    "class ###(###):":
     "Make a class named ### that is-a ###.",
    "class ###(object):\n\tdef __init__(self, ***)":
     "class ### has-a __init__ that takes self and *** parameters.",
    "class ###(object):\n\tdef __  









