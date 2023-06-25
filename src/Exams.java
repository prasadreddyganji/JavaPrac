public class Exams {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.1).

        System.out.println("It's time to take your 5th year exams. Please, take your seats.");
        String[] students = new String[]{"s1", "s2", "s3", "s4", "s5"};
        for(int i=0; i< students.length; i++)
        {
            System.out.println(students[i] + ", you will take seat " + i);

        }


    }
}
