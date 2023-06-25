public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;

        int scores[] = new int[10];
        System.out.print("Here are the scores: " );
        for (int i = 0; i < 10; i++)
        {
            scores[i] = (int) (Math.random() * 50000) ;
            System.out.print(scores[i] + " ");
        }

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).


        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
       // 0 to 49999.
    }    

}
