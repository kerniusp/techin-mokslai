
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }



    public Money plus(Money addition){

        Money newMoney = new Money(this.euros + addition.euros, this.cents +addition.cents);

        return  newMoney;
    }

    public boolean lessThan(Money compared){

        if (this.euros < compared.euros) {

            return true;

        } else if (this.euros == compared.euros) {

            if (this.cents < compared.cents) {

                return true;
            }

            return false;
        }
        return false;

    }

    public Money minus(Money decreaser){

        int money = 0;
        int cents = 0;


        if (this.euros >= decreaser.euros && this.cents > decreaser.cents) {

            money = this.euros - decreaser.euros;
            cents = this.cents - decreaser.cents;

        } else if (this.euros >= decreaser.euros && this.cents < decreaser.cents ) {

            money = (this.euros - decreaser.euros) - 1;
            if(this.cents == 0){
                cents = 100 - decreaser.cents;
            }else{
                cents = ((this.cents + 100) - decreaser.cents);
            }

        } else if (this.euros >= decreaser.euros && this.cents == decreaser.cents){
            money = (this.euros - decreaser.euros);
            cents = decreaser.cents;
        }

        Money newMoney = new Money(money,cents);
        return newMoney;
    }
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }


}
