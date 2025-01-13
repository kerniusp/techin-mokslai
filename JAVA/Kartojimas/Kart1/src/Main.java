public class Main {
    public static void main(String[] args) {

        weeksAndDays();
        clock();
        multiplicationTable();
        square(12);
    }

    public static void weeksAndDays() {
        for (int i = 1; i <= 7; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j <= 7; j++) {
                System.out.println(String.format("%12s", "Day " + j));
            }
        }
    }

    public static void clock() {

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {

                if (i >= 10 && j >= 10) {
                    System.out.println(i + ":" + j);
                } else if (i <= 10 && j >= 10) {
                    System.out.println("0" + "" + i + ":" + j);
                } else if (i >= 10 && j <= 10) {
                    System.out.println(i + ":" + "0" + "" + j);
                } else {
                    System.out.println("0" + "" + i + ":" + "0" + "" + j);
                }
            }

        }
    }

    public static void multiplicationTable() {

        System.out.println("Multiplication Table\n");

        System.out.print("  ");
        for(int m = 1; m < 10; m++){
            System.out.print("  "+m);
        }
        System.out.println();
        for (int k = 1; k < 30; k++){
            System.out.print("_");
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.print(i + " |");

            for (int j = 1; j < 10; j++) {


                if (i * j < 10) {
                    System.out.print(" " + i * j + " ");
                } else {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void square(int number) {

        int gap = number - 2;

        for (int i = 1; i <= number; i++) {

            if (i == 1 || i == number) {
                for (int j = 1; j <= number; j++) {
                    System.out.print("#  ");
                }
            } else {
                System.out.print("#  ");
                printSpaces(gap);
                System.out.print("#  ");
            }
            System.out.println();

        }
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("   ");
        }
    }

}