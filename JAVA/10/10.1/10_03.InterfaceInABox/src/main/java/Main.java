
public class Main {

    public static void main(String[] args) {
        // test your classes here
//        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishmet", 2);
//        Book book2 = new Book("Robert Martin", "Clean code", 1);
//        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
//
//        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
//        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
//
//        System.out.println(book1);
//        System.out.println(book3);
//        System.out.println(cd1);
//
//        System.out.println(book2.weight());
//        System.out.println(cd2.weight());

        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoesvky", "Crime and punishment", 2));
        box.add(new Book("Fyodor Dostoesvky", "Crime and punishment", 5));
        box.add(new Book("Fyodor Dostoesvky", "Crime and punishment", 1));


        box.add(new CD("Pink floyd", "Dark side of the moon", 1973));
        box.add(new CD("Pink floyd", "Dark side of the moon", 1973));

        System.out.println(box);


    }

}
