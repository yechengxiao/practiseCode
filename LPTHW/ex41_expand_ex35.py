from sys import exit

class Room(object):
    def __init__(self, messages):
        self.messages = messages

    def print_message(self):
	for line in self.messages:
	    print line

    def open_door(self):
        pass

class Gold_room(Room):

    def __init__(self, message):
        super(Gold_room, self).__init__(message)

    def print_message(self):
        super(Gold_room, self).print_message(self)





