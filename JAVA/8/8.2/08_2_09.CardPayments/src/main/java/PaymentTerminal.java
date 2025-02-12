
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        if(payment >= 2.50){
            money += payment;
            affordableMeals++;
            money -= payment - 2.50;
            return payment - 2.50;

        }else{
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >= 4.30){
            money += payment;
            heartyMeals++;
            money -= payment - 4.30;
            return payment - 4.30;
        }else{
            return payment;
        }

    }

    public boolean eatAffordably(PaymentCard card){

        if(card.balance() >= 2.50){
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        }else {
            return false;
        }

    }

    public boolean eatHeartily(PaymentCard card){
        if(card.balance() >= 4.30){
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        }else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum > 0){
            money += sum;
            card.addMoney(sum);
        }

    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
