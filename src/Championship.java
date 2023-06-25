public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points




        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;
        if(margin >=300)
            System.out.println("won");
        else if(margin ==1 || margin==0)
            System.out.println("second");
        else if((margin >= -100) && margin < 0)
            System.out.println("third");
        else
        System.out.println("fourth");
    }
}
