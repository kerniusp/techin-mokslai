import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Name: ");
            String programsName = scanner.nextLine();

            if (programsName.equals("")) {
                break;
            }

            System.out.print("Duration: ");
            int programsDuration = Integer.parseInt(scanner.nextLine());

            TelevisionProgram program = new TelevisionProgram(programsName, programsDuration);
            programs.add(program);
        }

        System.out.print("Programs maximum duration?");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < programs.size(); i++) {
            if (programs.get(i).getDuration() <= maxDuration) {
                System.out.println(programs.get(i));
            }
        }

    }
}
