class TheBridge:
    def the_bridge(self):
        print "You burst onto the Bridge with the netron destruct bomb"
        print "under your arm and surprise 5 Gothons who are trying to"
        print "take control of the ship. Each of them has an even uglier"
        print "clown costume than the last. They haven't pulled their"
        print "weapons ot yet, as they see the active bomb under your"
        print "arm and don't want to set it off."

        action = raw_input(">>throw the bomb or slowly place the bomb>>")
	print

        if action == "throw the bomb":
            print "In a panic you throw the bomb at the group of Gothons"
            print "and make a leap for the door. Right as you drop it a"
            print "Gothon shoots you right in the back killing you ."
            print "As you die you see another Gothn frantically try to disarm"
            print "the bomb. You die knowing they will probably blow up when"
            print "it goes off\n"
            #return {"Game": "death"}
	    return self.the_bridge()

        elif action == "slowly place the bomb":
            print "You point your blaster at the bomb under you arm"
            print "and the Gothons put their hands up and start to sweat."
            print "You inch backward to the door, open it, and then carefully"
            print "place the bomb o the floor, pointing your blaster at it."
            print "You them jump back through tohe door, punch the close button"
            print "and blast the lock so the Gothons cat't get out."
            print  "Now that the bobm is placed you run to the escape pod to"
            print "get off this tin can.\n"
            return {'EscapePod': 'escape_pod'}

        else:
            print "DOES NOT COMPUTE!"
            return self.the_bridge()
