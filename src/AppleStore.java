public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.3 to access the link).
        numOfApples += 500;
        System.out.println("You picked 500 apples from an apple orchard");
        float eachapplecost = 0.4f ;
        System.out.println("Time for business! You're selling each apple for 40 cents");
        numOfCustomers += 1;
        profit += 4*eachapplecost;
        numOfApples -= 4;
        System.out.println("One customer walked in. He bought 4 apples!");
        numOfCustomers += 1;
        profit += 20*eachapplecost;
        numOfApples -= 20;

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfCustomers += 1;
        profit += 200*eachapplecost;
        numOfApples -= 200;

        System.out.println("Another customer walked in. She bought 200 apples!");
        

        System.out.println("Wow! So far, you made: $" + profit);
        System.out.println(numOfCustomers +" customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left.");

        // Compare your result to what's on Learn the Part.  
        
    }

}
