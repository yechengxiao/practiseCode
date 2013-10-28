from random import randint


class EscapePod:
    def escape_pod(self):
        print "You rush through the ship desperately trying to make it to "
        print "the escape pod before the  whole ship explodes. It seems like"
        print "hardly and Gothons are on the ship, so your run is clear of"
        print "interferendce. You get to the chamber with the escape pods, and"
        print "now need to pick one to take. Some of them could be damaged"
        print "but you don't have time to look. There's 5 pods, which one"
        print "do you take?"
        good_pod = randint(1, 5)

        print "good_pod:---> %d " % good_pod
        guess = raw_input("[pod #]>> ")
	print

        if int(guess) != good_pod:
            print "You jump into pod %s and hit the eject button." % guess
            print "The pod escapes out into the void of sapce, then"
            print "implodes as the hull ruptures, crushing your body"
            print "into jam jelly."
            #return {"Game": "death"}
	    return self.escape_pod()

        else:
            print "You jump into pod %s and hit the eject button." % guess
            print "The pod easily slides out into space heading to"
            print "the planet below. As it flies to the planet, you look"
            print "back and see your ship implode then explode like a"
            print "bright star, taking out the Gothon ship at the same"
            print "time. You won!"
            exit(0)
