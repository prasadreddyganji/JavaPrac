import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {

        double[] price = {1.99, 2.99, 3.99, 4.99};

        // See instructions on Learn the Part (Workbook 6.9)

        String x1 = Arrays.toString(price);

        System.out.println("The original prices are: " + x1);


        double price2[] = Arrays.copyOf(price, price.length);

        System.out.println("prices are "+ Arrays.toString(price2));
        for(int i =0; i < price.length; i++)
            price[i] = Math.round((0.13 * price[i]+ price[i]) * 100) / 100.0;

        System.out.println("The prices after tax are: " + Arrays.toString(price));


        System.out.println("prices are "+ Arrays.toString(price2));

    }
}
