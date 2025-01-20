

public class MainProgram {

    public static void main(String[] args) {
        //you can test the program here
        Herd herd = new Herd();

        herd.addToHerd(new Organism(57,60));
        herd.addToHerd(new Organism(73,56));
        System.out.println(herd.toString());


    }
}
