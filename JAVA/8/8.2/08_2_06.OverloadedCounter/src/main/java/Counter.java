public class Counter {

    private int startValue;

    public Counter(int startValue){
        this.startValue = startValue;
    }
    public Counter(){
        startValue = 0;
    }

    public int value(){
        return startValue;
    }

    public void increase(){
        startValue++;
    }
    public void increase(int number){
        if(number > 0){
            startValue += number;
        }

    }

    public void decrease(){
        startValue--;
    }
    public void decrease(int number){
        if(number > 0){
            startValue-= number;
        }

    }
}
