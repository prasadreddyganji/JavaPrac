import java.util.Scanner;

public class Megaphone {
    public static void main(String[] args) {
        // See Learn the Part for the instructions.
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a num to choose how to count: ");
        int res = sc.nextInt();

        for(int i = 0; i < res; i++)
            System.out.print(i +" ");

    }
    
}
