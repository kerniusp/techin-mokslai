
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(30, 12, 2011);

        date.advance(3);

        System.out.println(date);

//        System.out.println("Friday of the examined week is " + date);
////
//        SimpleDate newDate = date.afterNumberOfDays(7);
//        int week = 1;
//        while(week<= 7){
//            System.out.println("Friday after " + week + " week is " + newDate);
//            newDate = newDate.afterNumberOfDays(7);
//            week = week + 1;
//        }
//        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself! ");
    }
}
