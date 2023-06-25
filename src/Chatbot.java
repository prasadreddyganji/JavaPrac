//import Scanner
import java.util.*;
public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        
        //set up scanner. 
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        String userName = sc.nextLine();
                           
        //add new a line before asking next question. 
        System.out.println("Hi " + userName +"! I'm Javabot. \nWhere are you from?");
        //Pick up user's home and store it.
        String home = sc.nextLine();
                        

        //add new a line before asking next question.
        System.out.println("I hear it's beautiful at " +home+ "! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        //Pick up age and store it.
        int age = sc.nextInt();

        //add new a line before asking next question.
        System.out.println("So you're " +age+", cool! I'm 400 years old.");
        System.out.println("This means I'm " + ((double)400/age) +" times older than you.");
        System.out.println("Enough about me. \nWhat's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        sc.nextLine();
        String language = sc.nextLine();

        //add new a line here.
        System.out.println(language+", that's great! Nice chatting with you " + userName +". I have to log off now. See ya!");
        
        //close scanner.
        sc.close();

        
    }
}
