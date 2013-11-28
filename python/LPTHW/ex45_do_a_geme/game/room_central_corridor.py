class CentralCorridor:
    def __init__(self):
        pass

    def print_message(self):
        print "The Gothons of Planet Percal #25 have invaded your ship and destroyed"
        print "your entire crew. You are the last surviving member and your last"
        print "mission is to get the neutron destruct bomb from the Weapons Armory,"
        print "put it in the bridge, and blow the ship up after getting into an "
        print "escape pod.\n"
        print "You're running down the central corridor tho the Weapons Armory when"
        print "a Gothon jumps out, red scaly skin, dark grimy teeth, and evil clown costume"
        print "flowing around his hate filled body. He's blocking the door to the"
        print "Armory and about to pull a weapon to blast you.\n"


    def action(self):
        action = raw_input(">>shoot! or dedge! or tell a joke or>>")

        if action == "shoot!":
            print "Quick on the draw you yank out your blaster and fire it at the Gothon."
            print "His clown costume is flowing and moving around his body, whick throws"
            print "off your aim. Your laser hits his costume his mother bought him, which"
            print "makes him fly into an insane rage and blast you repeatedly int the face until"
            print "you are dead. Then he eats you.\n"
            #return {'Game': 'death'}
            return self.action()

        elif action == "dedge!":
            print "Like a world class boxer you dodge, weave, slip and slide right"
            print "as the Gothon's blaster cranks a laser past your head."
            print "bang your head on the metal wall and pass out."
            print "You wake up shortly after only to die as the Gothon stomps on"
            print "your head and eats you.\n"
            #return {'Game': 'death'}
            return self.action()

        elif action == "tell a joke":
            print "Lucky for you they made you learn Gothon insults in the academy."
            print "You tell the one Gothon joke you know:"
            print "Lbhe zbgure vf fb sng, jura fur fvgf nebhaq qur ubhfr, fur fvgf nebhaq gur ubhfr."
            print "The Gothon stops, tries not to laugh, then busts out laughing adn cat't move."
            print "While he's laughing you run up and shoot him square in the dead"
            print "putting him down, the jump through the Weapon ASrmory door.\n"
            return {'LaserWeaponArmory': 'laser_weapon_armory'}

        else:
            print "DOES NOT COMPUTE!"
            return self.action()
