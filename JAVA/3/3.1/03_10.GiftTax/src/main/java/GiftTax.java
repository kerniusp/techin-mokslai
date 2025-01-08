
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.parseInt(scan.nextLine());
        int taxLowerLimit = 0;
        double taxRate= 0;
        int giftValue = 0;

        if(gift >= 5000 && gift <= 25000){
            taxLowerLimit = 100;
            taxRate = 0.08;
            giftValue = 5000;
        }else if(gift <= 55000){
            taxLowerLimit = 1700;
            taxRate = 0.10;
            giftValue = 25000;
        }else if(gift <= 200000){
            taxLowerLimit = 4700;
            taxRate = 0.12;
            giftValue = 55000;
        }else if(gift <= 1000000){
            taxLowerLimit = 22100;
            taxRate = 0.15;
            giftValue = 200000;
        }else if(gift > 1000000){
            taxLowerLimit = 142100;
            taxRate = 0.17;
            giftValue = 1000000;
        }

        double formula = taxLowerLimit + (gift - giftValue) * taxRate;

        if(formula > 0){
            System.out.println("Tax: "+formula);
        }else{
            System.out.println("No tax!");
        }

    }
}
