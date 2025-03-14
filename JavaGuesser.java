import java.util.Random;
import java.util.Scanner;

public class Guesser {

    Scanner input = new Scanner(System.in);
    Random randomNumber = new Random();
    int randomInt = randomNumber.nextInt(100) + 1;
    int attempts = 0;
    int guess = 0;

    public static void main(String[] args) {
        new Guesser();
    }

public static humanGuesser() {
    System.out.println("I am thinking of a number between 1 and 100. Please enter a number: ")

    while(guess != randomInt){
         System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
         attempt++;

    if (guess > randomInt){
        System.out.println("Too high, try again.");
    } else if (guess < randomInt){
        System.out.println("Too low, try again.");
    } else {
        System.out.println("Got it! Good work!");
        }
    }

    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        scanner.close();
}

private int getMean(int lower, int upper){
    int mean = (int)((lower+upper)/2);
    return mean;
}
    
public static computerGuesser() {
    int lower = 1;
    int upper = 100;
    int try = getMean(lower, upper);
    String response = ""

    int turns = 0;
    boolean keepGoing = true;
        
    System.out.println("Think of a number between 1 and 100. I will try to guess it.")

    while(keepGoing){
        turns++

        System.out.println(turns + ") I guess " + guess);
        System.out.println("Too (H)igh, Too (L)ow, or (C)orrect? ");
        response = input.nextLine;
    }     
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
