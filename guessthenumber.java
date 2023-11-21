import java.util.Scanner;
import java.util.Random;

// Guess the number game;
public class Guess_the_number {
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.loop();
    }
    
}
class Game{
    int NoOfGuess ; int Random_Num ; int Choice ; 

    public Game(){   //constructor
        NoOfGuess = 0;  // initialised as zero
        Random rn = new Random();
        Random_Num = rn.nextInt(1,101);

    }
    public void TakeInput(){
        System.out.print("Enter choice form (1,100) : ");
        Scanner sc = new Scanner(System.in);
        Choice = sc.nextInt();
    }
    public void Check(){
        if (Choice > Random_Num) {
            System.out.println("Enter smaller number");
            
        }
        else if (Choice < Random_Num) {
            System.out.println("Enter Greater number");
             
        }
        else if(Choice == Random_Num ){
            System.out.println("Correct guess !!!");
            
        }
    }

    public void loop(){
        while (true) {
            TakeInput();
            NoOfGuess += 1;
            Check();
            if (Choice == Random_Num) {
                System.out.printf("Random number : %d \n",Random_Num);
                System.out.format("no of guesses : %d",NoOfGuess);
                break;
            }
        
        }
         
    }
}    





