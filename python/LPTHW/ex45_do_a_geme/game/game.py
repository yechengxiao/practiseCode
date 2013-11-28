# -*-coding:utf8-*-
import sys
from room_central_corridor import CentralCorridor
from room_laser_weapon_armory import LaserWeaponArmory
from room_the_bridge import TheBridge
from room_escape_pod import EscapePod


class Game(object):
    def __init__(self):
        print("---Game start---\n")
        self.rooms = {}

    def play(self):

        centralCorridor = CentralCorridor()
        centralCorridor.print_message()
        next_action = centralCorridor.action() # return dict

        while True:
            for key, value in next_action.items():
                print "key--> %s, value--> %s" % (key, value)
                # can't run the methos! getattr(obj,str) is attribute,getattr(obj,str)() is method
                next_action = getattr(self.rooms.get(key), "%s" % value)()

                #while True:
                #    for key, value in next_action.items():
                #        print "key--> %s, value--> %s" % (key, value)
                #        # can't run the methos! getattr(obj,str) is attribute,getattr(obj,str)() is method
                #        next_action = getattr(sys.modules[key], "%s" % value)


    def death(self):
        print("---Game over---\n")
        sys.exit(1)

    def update_rooms(self, room): # update rooms
        self.rooms.update(room)


game = Game()
game.update_rooms({'Game': game})
game.update_rooms(
    {"CentralCorridor": CentralCorridor(), "LaserWeaponArmory": LaserWeaponArmory(), "TheBridge": TheBridge(),
     "EscapePod": EscapePod()})

game.play()
