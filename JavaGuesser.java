import java.util.Random;
import java.util.Scanner;

public class Guesser {

    Scanner input = new Scanner(System.in);
    Random randomNumber = new Random();
    int randomInt = randomNumber.nextInt(100) + 1;

    public static void main(String[] args) {
        new Guesser();
    }

public static humanGuesser() {
    boolean keepGoing = true;
    while(keepGoing){
        System.out.println("I am thinking of a number between 1 and 100. Please enter a number: ")
            response = input.nextLine();

    if (response > randomInt){
        System.out.println("Too high, try again.");
    } else if (response < randomInt){
        System.out.println("Too low, try again.");
    } else {
        System.out.println("Got it! Good work!");
        keepGoing = false;
        }
    }
        
}

public static computerGuesser() {
    boolean keepGoing = true;
    while(keeGoing){
        System.out.println("Think of a number between 1 and 100. I will try to guess it.")
        System.out.println("I guess " + (randomNumber.nextInt(100) + 1))
}


    public Guesser(){
        boolean keepGoing = true;
        while(keepGoing){
    
          System.out.println("Please enter 0-2:")
            String.response = input.nextLine()
              
            switch(response){
              case 0:
                  keepGoing = false;
            break;

              case 1:
                  humanGuesser();
            break;

              case 2:
                  computerGuesser();
            break;
          }
}
