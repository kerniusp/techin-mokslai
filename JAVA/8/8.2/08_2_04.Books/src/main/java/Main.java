import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        while(true){
            System.out.print("Title:");
            String bookTitle = scanner.nextLine();
            if(bookTitle.equals("")){
                break;
            }

            System.out.print("Pages: ");
            int pageNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book newBook = new Book(bookTitle,pageNumber,publicationYear);
            list.add(newBook);
        }

        System.out.print("What information will be printed? ");
        String informationPrinted = scanner.nextLine();

        for(int i = 0; i < list.size(); i++){

            if(informationPrinted.equals("everything")){
                System.out.println(list.get(i));
            }else if(informationPrinted.equals("name")){
                System.out.println(list.get(i).getBookTitle());
            }

        }

    }
}
