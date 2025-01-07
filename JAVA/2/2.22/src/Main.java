import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        //Convert mile to kilometer
        System.out.println("Enter miles:");

        int miles = Integer.parseInt(scaner.nextLine());
        double km = miles * 1.6;

        System.out.println(miles + " miles is " + km + " kilometers");

        //Find the number of years
        System.out.println("Enter the number of minutes ");
        int minutes = Integer.parseInt(scaner.nextLine());

        double valandos = (double)minutes / 60;
        double dienos = valandos / 24;
        int metai = (int)dienos / 365;

        int galutinesDienos = (int)dienos % 365;

        System.out.println(minutes + " minutes is approximately " + metai + " years and " + galutinesDienos +" days");

        //Geometry: distance of two points

        System.out.println("Enter x1");
        double x1 = Double.parseDouble(scaner.nextLine());

        System.out.println("Enter y1");
        double y1 = Double.parseDouble(scaner.nextLine());

        System.out.println("Enter x2");
        double x2 = Double.parseDouble(scaner.nextLine());

        System.out.println("Enter y2");
        double y2 = Double.parseDouble(scaner.nextLine());

        double formula = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        System.out.println("The distance between the two points is " + formula);

    }
}