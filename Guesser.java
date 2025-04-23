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
            } else if (result.equals("2")){
                computerGuesser();
            } else {
                System.out.println("Please enter 0-2");
            }
           
        };
    }

    public String menu(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("0). Exit");
        System.out.println("1). Human Guesser");
        System.out.println("2). Computer Guesser");

        System.out.println();
        System.out.println("Please enter 0-2: ");

        String result = input.nextLine();
        return result;
    }

    public void humanGuesser(){
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        System.out.println("I am thinking of a number between 1 and 100. Try your best to guess it.");

        boolean keepGoing = true;
        while(keepGoing){

            if(attempts <= 7){

                System.out.printf("%d). Please guess the number: ",attempts);
                int userResult = input.nextInt();
                attempts++;

                if (userResult > randomNumber){
                    System.out.println("Too high, try again.");
                } else if (userResult < randomNumber){
                    System.out.println("Too low, try again.");
                } else if (userResult == randomNumber){
                    System.out.println("Congrats! You guessed the number!");
                    keepGoing = false;
                } else {
                    System.out.println("You've ran out of tries. Better luck next time...");
                    keepGoing = false;
                }
            }else{
                System.out.println("You lose!");
                keepGoing = false;
            }
        }

    }

    public void computerGuesser(){
        System.out.println("Think of a number between 1 and 100. I'm going to try and guess it.");
        boolean keepGoing = true;
        int low = 0;
        int high = 100;
        int guess = (low + high) / 2;

        
        while(keepGoing){
            
            attempt++;

            System.out.printf("%d). My guess is %d was higher(h), lower(l), or correct(c)?: \n",attempt,guess);
            String response = input.nextLine();


            if (response.equals("c")){
                System.out.println("Yay! I guessed it in " + attempt + " attempts.");
                    keepGoing = false;
                } else if (response.equals("h")) {
                    low = guess + 1;
                } else if (response.equals("l")) {
                    high = guess - 1;
                } else {
                    System.out.println("Please respond with h(higher), l(lower), c(correct).");
                }

                guess = (low + high) / 2;

                if (low > high) {
                    System.out.println("Hmm, it seems there was a misunderstanding. Let's try again.");
                    keepGoing = false;
                }
        }
    }
}