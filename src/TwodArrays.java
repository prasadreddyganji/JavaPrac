import java.lang.reflect.Array;
import java.util.Arrays;

public class TwodArrays {
    public static void main(String[] args) {

        double[][] arr =
                {
                        {12.99, 8.99,9.99, 10.49, 11.99},
                        {0.99,1.99, 2.49, 1.49, 2.99 },
                        {8.99, 7.99, 9.49, 9.99, 110.99}};

        System.out.println("Baking: " + Arrays.toString(arr[0]));
        System.out.println("Beverage: " + Arrays.toString(arr[1]));
        System.out.println("Cereals: " + Arrays.toString(arr[2]));


    }
}
