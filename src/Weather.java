public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        Weather v = new Weather();
        v.printTemperatures(noon);
        v.printTemperatures(evening);
        v.printTemperatures(midnight);
        
    }


    //Task 1: Make a function here. See the doc comments below. 
public double fahrenheitToCelsius(double F)
{
    double C = (F-32) * 5.0/9;
    return C;
}

/**
 *
 *
 * @param F
 *
 **/
     public void printTemperatures(double F)
     {
         System.out.println("F: " + F + "\nC: "+

                 Math.round(fahrenheitToCelsius(F))/100.0);

     }
/**
 *
 * Function name: great
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */

}