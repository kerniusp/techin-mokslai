public class Dog extends Animal implements NoiseCapable {

    public Dog(String name) {
        super(name);
    }

    public Dog(){
        super("Dog");
    }

    public void bark(){
        System.out.println(getName() + " barks");
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
