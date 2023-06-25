public class RandomNumbers {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.14)

        int[][] array = new int[100][10];
        for(int i =0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = randomNumber();
        }

        print2DArray(array);
    }
    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }
/**
 * Function name: print2DArray
 * @param array ( int[][] )
 *
 *
 *
 *
 *
 *
 */
public static void print2DArray(int[][] array)
{
    for(int i = 0; i < array.length; i++)
    {
        for(int j = 0; j < array[0].length; j++)
        {
            System.out.print(array[i][j] + "\t");
        }
        System.out.println();
    }
}


}
