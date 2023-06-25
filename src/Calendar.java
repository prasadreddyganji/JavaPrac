public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Frday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");

        boolean free = false;
        System.out.println("Hmm, let me check my calendar.");
        switch(day){
            case "Monday":
                free = false;
                break;
            case "Tuesday":
                free = false;
                break;
            case "Wednesday":
                free = false;
                break;
            case "Thursday":
                free = false;
                break;
            case "Friday":
                free = false;
                break;
            case "Saturday":
                free = true;
                break;
            case "Sunday":
                free = true;
                break;
            default:
                System.out.println("Lets break this!!!!");

        }
        if(free == true)
            System.out.println("Yup!! I am free!! ");
        //Check 'calendar' here:        
        

    }
}
