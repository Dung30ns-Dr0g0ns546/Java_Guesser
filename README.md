# Java_Guesser

## Algorithm for JavaGuesser

# Data

import "java.util.Random"
import "java.util.Scanner"

# public class Guesser ()
Create a Scanner class called "input"
Create a Random class called "randomNumber"
Create a int called "lowerBounds" and have it equal 1
Create a int called "upperBounds" and have it equal 100

Create a public static void "main" and have it contain "new Guesser"

# public Guesser
Have boolean "keepGoing" set to true
While "keepGoing" is true: pull the result from "Menu" class
If result equals 0: set keepGoing to false
If result equals 1: allow user to access "humanGuesser" program
If result equals 2: allow user to access "computerGuesser" program
Else, print out "Please Enter 0-2"

# public String menu()
Have input be new Scanner

Print out "0. Exit"
Print out "1. Human Guesser"
Print out "2. Computer Guesser"
Print out "Select 0-2"

Have input be referred as "result" and return it once the user makes a choice.

# public boolean humanGuesser()
Have input be new Scanner

Print out "I am thinking of a number between 1 and 100. Try your best to guess it."
set boolean "keepGoing" as true
While keepGoing is true: print out "please try to guess the number."
If the number 