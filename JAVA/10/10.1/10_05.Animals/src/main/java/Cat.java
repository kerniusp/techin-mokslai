public class Cat extends Animal implements NoiseCapable {

    

    public Cat(String name) {
        super(name);
    }

    public Cat(){
        super("Cat");
    }

    void purr(){
        System.out.println(getName() + " purrs");
    }

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
