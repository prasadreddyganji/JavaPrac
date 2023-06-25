import java.sql.SQLOutput;
import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = rollDice();
        int n2 = rollDice();
        int n3 = rollDice();
        System.out.println("Enter 3 nums b/w 1 and 6:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }

    public static int rollDice()
    {
        int randomNumber = (int) (Math.random()*6 )+ 1;


        return  randomNumber;
    }


}
