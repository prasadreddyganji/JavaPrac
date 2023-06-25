import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //Creating an array topCities_2022 and assigning city names
        String[] topCities_2022 = {"NYC", "Tokyo", "Beijing", "London", "Paris"};

        //Using Arrays.copyOf to copy array1 elements to array2
        String[] topCities_2023 = new String[topCities_2022.length];

        //Then update the last element
        topCities_2023[4] = "Seoul";

        System.out.println("Top cities in 2022 are: " + Arrays.toString(topCities_2022));
        System.out.println("Top cities in 2023 are: " + Arrays.toString(topCities_2023));
    }
}