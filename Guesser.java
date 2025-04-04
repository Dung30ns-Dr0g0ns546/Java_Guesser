import java.util.Random;
import java.util.Scanner;


public class Guesser {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;
    int attempt = 0;
   
    public static void main(String[] args) {
        new Guesser();
    }


    public Guesser(){
        boolean keepGoing = true;
        while(keepGoing){
            String result = menu();
            if (result.equals("0")){
                keepGoing = false;
            } else if (result.equals("1")){
                humanGuesser();
            } else if (result.equal("2")){
                computerGuesser();
            } else {
                System.out.println("Please enter 0-2");
            }
           
        };
    }

    public String menu(){
        System.out.println("0). Exit");
        System.out.println("1). Human Guesser");
        System.out.println("2). Computer Guesser");

        System.out.println();
        System.out.println("Please enter 0-2: ");

        String result = input.nextLine();
        return result;
    }

    public boolean humanGuesser(){
        System.out.println("I am thinking of a number between 1 and 100. Try your best to guess it.");

        boolean keepGoing = true;
        while(keepGoing){
            System.out.println("Please guess the number: ");
            int userResult = input.nextInt();
            attempt++;


            if (userResult > randomNumber){
                System.out.println("Too high, try again.");
            } else if (userResult < randomNumber){
                System.out.println("Too low, try again.");
            } else if (userResult = randomNumber){
                System.out.println("Congrats! You guessed the number!");
                keepGoing = false;
            } else {
                System.out.println("You've ran out of tries. Better luck next time...");
                keepGoing = false;
            }
        }

    }

    public boolean computerGuesser(){
        System.out.println("Think of a number between 1 and 100. I'm going to try and guess it.");
        boolean keepGoing = true;
        
        while(keepGoing){
        System.out.println("Is the number... " + randomNumber() + "?");
        String response = input.nextLine();
        attempt++;



        if ()

        }
    }
    
}
    


