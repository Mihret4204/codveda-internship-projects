package Level1.Number;

import java.security.SecureRandom;
import java.util.Scanner;
public class NumberG{
    public static void main(String[] args) {
        SecureRandom random=new SecureRandom();
        int randomnum= random.nextInt(100);

        int number;
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number you guess 0 to 99.");
        int count=0;
        
       
        while (true) {
            if(!input.hasNextInt()){
                System.out.println("Invalid input. Please enter a valid number");
                input.next();
                continue;
            }

            number=input.nextInt();
             count++;
            
            if(randomnum>number){
                System.out.println("too low. Try again.");}
            else if(randomnum<number){
                System.out.println("too high. Try again.");
            }else{
                 System.out.println("Congratulations! You guessed the number.");
                 System.out.println("number of attempts: "+(count+1));
                break;
            }
            
        }
       
       input.close();
        
    }
}

