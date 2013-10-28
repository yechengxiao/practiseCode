from random import randint


class LaserWeaponArmory:
    def laser_weapon_armory(self):
        print "You do a dive roll into the Weapon Armory, crouch and scan the room"
        print "for more Gothons that might be hiding. It's dead quiet, too quiet."
        print "You stantd up and run to the far side of the room and find the"
        print "neutron bomb in its container. There's a keypad lock on the box"
        print "and you need the code to get the bomb out. If you get code"
        print "wrong 10 times then the lock closes forever and you can't"
        print "get the bomb. The code is 3 digits."

        code = "%d%d%d" % (randint(1, 9), randint(1, 9), randint(1, 9)) # generate int in [1,9]
        print "code:---> %s " % code

        guess = raw_input("[keypad]>> ")
	print
        guess_count = 0

        while guess != code and guess_count < 10:
            print "BZZZZeddd!"
            guess_count += 1
            guess = raw_input("[keypad]>> ")

        if guess == code:
            print "The container clicks open and the seal breaks, letting gas out."
            print "You grab the neutron bomb and run as fast as you can to the"
            print "bridge where you must place it in the right spot.\n"
            return {"TheBridge": "the_bridge"}

        else:
            print "The lock buzzes one last time and then you bear a sickening"
            print "melting sound as the mechanism is fused together."
            print "You decide to sit there, and finally the Gothons blow up the"
            print "ship form their ship and you die.\n"
            #return {"Game": "death"}
	    return self.laser_weapon_armory()

