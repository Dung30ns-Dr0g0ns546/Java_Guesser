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

# public void humanGuesser()
Have input be new Scanner

Print out "I am thinking of a number between 1 and 100. Try your best to guess it."
set boolean "keepGoing" as true
While keepGoing is true: print out "please try to guess the number."
Keep track the number of attempts the user has
If the number is greater than the random number, print "Too High, try again."
Else If the number is lesser than the random number, print "Too Low, try again."
Else If the number equals the random number, print "Congrats, you got the number" and set keepGoing to false
Else print "You ran out of tries. Better luck next time."

# public void computerGuesser()
Have input be new Scanner

Print out "Think of a number between 1 and 100. I will try to guess it."
Set boolean "keepGoing" as true
Set int "low" as 0
Set int "high" as 100
Set int "Guess" as low + high divided by 2

While keepGoing is true: print out 