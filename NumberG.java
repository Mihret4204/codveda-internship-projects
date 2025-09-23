package Level1.Number;

import java.security.SecureRandom;
import java.util.Scanner;
public class NumberG{
    public static void main(String[] args) {
        SecureRandom random=new SecureRandom();
        int randomnum= random.nextInt(100);

        int number;
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter your guess");
        number=input.nextInt();
        int count=0;
        
       
        while (true) {
            
            if(randomnum>number){
                System.out.println("too low");
                 System.out.println("enter your guess");
                 number=input.nextInt();
                    count++;
            }
            else if(randomnum<number){
                System.out.println("too high");
                number=input.nextInt();
                count++;
            }else{
                 System.out.println("Congratulations! You guessed the number.");
                 System.out.println("number of attempts: "+(count+1));
                break;
            }
            
        }
       
       input.close();
        
    }
}
