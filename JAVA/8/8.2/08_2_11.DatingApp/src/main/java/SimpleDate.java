
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (day < 30) {
            day++;
        } else {
            month++;
            day -= 29;
        }

        if (month == 12) {
            month = 12;
        } else if (month > 12) {
            month -= 12;
            year++;
        }

    }

    public void advance(int howManyDays) {


        for (int i = 1; i <= howManyDays; i++) {
            advance();
        }

    }

    public SimpleDate afterNumberOfDays(int days) {

        SimpleDate newDate = new SimpleDate(this.day, month, year);
        newDate.advance(days);

        if (newDate.day >= 30) {
            newDate.day -= 30;
            newDate.month++;
            return newDate;
        }
        return newDate;


    }

}
