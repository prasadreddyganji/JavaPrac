public class Tip {

    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        Tip t = new Tip();

        t.tipTheWaiter(bill);
        //Task 2: Call a function that tips the waiter.
    }



    
    //Task 1: Make a function here. See the doc comment for details.  
public void tipTheWaiter(double bill)
{
    double tip = bill * (15 /100.0);
    System.out.println("Your service was wonderful! Please, accept this tip: " + tip);
}

}