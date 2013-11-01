#-*-coding:utf8-*-
class Song(object):

    def __init__(self, lyrics): # 构造函数 
	self.lyrics = lyrics # 表示实例属性 

    def sing_me_a_song(self):
	for line in self.lyrics: # 一个字符串也会被当成list
	    print line

    def print_the_song(self):
	print self.lyrics

    def print_copy(self):
	self.lyrics_copy = self.lyrics
	print self.lyrics_copy





happy_bday = Song(["Happy birthday to you", "I don't want to get sued","So I'll stop right there"])

bulls_on_parade = Song(["They raly around the family", "With pockets ful of shells"])

happy_bday.sing_me_a_song()
bulls_on_parade.sing_me_a_song()

song_without_list = Song("with out list")
song_without_list.sing_me_a_song() 


# song_without_list = Song() # error

song_without_list.print_the_song()
bulls_on_parade.print_the_song()
print bulls_on_parade.lyrics
bulls_on_parade.print_copy()
