import java.util.Random;
import java.util.Scanner;


public class Guesser {


    Scanner input = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Guesser();
    }


    public Guesser(){
        boolean keepGoing = true;
        while(keepGoing){
            String result = menu();
            if (result.equals("0")){
                keepGoing = false;
            } elseif (result.equals("1"));{
                humanGuesser();
            } else {
                computerGuesser();
            }
   
           
        };
    }

    public String menu(){
        System.out.println("0. Exit");
        System.out.println("1. Human Guesser");
        System.out.println("2. Computer Guesser");

        System.out.println();
        System.out.println("Please enter 0-2: ");

        String result = input.nextLine();
        return result;
    }
    
}
    


