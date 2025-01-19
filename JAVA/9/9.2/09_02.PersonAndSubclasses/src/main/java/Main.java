import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        ArrayList<Person> persons = new ArrayList<>();

        Student ollie = new Student("Student Lovelace","24 Maddox St. London W1S QN");
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox", 1200);
        Teacher esko = new Teacher("Esko unokene", " Maneerhenmite 15", 5400);

//        System.out.println(ada);
//        System.out.println(esko);
//
//        for(int i = 0; i < 25; i++){
//            ollie.study();
//        }
//        System.out.println(ollie);
//
//        persons.add(ollie);
//        persons.add(ada);
//        persons.add(esko);
//
//        printPersons(persons);

        System.out.println(ollie);

    }

    public static void printPersons(ArrayList<Person> allPersons){

        for(int i = 0; i < allPersons.size(); i++){
            System.out.println(allPersons.get(i));
        }
    }

}
