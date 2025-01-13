import static java.lang.StringUTF16.indexOf;

public class Main {
    public static void main(String[] args) {

        int
    }


//        System.out.println(convertTemp(25));
//        System.out.println(minutesToTime(185));
//        numberPattern(4);
//        System.out.println(calculatePower(2, 3));
//        System.out.println(digitSum(123));
//        System.out.println(calculateDistance(0, 0, 3, 4));
//        System.out.println(countDivisors(12));
//        System.out.println(isPerfect(6));
//        System.out.println(isPerfect(15));
//        oddMultiplicationTable(5);


    public static String convertTemp(double celsius) {

        double fahrenheit = (celsius * 9 / 5) + 32;
        return celsius + "°C is equal to " + fahrenheit + "°F";
    }

    public static String minutesToTime(int minutes) {

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + " hours and " + remainingMinutes + " minutes";
    }

    public static void numberPattern(int rows) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static int calculatePower(int base, int exponent) {

        int answer = base;

        for (int i = 1; i < exponent; i++) {
            answer = answer * base;
        }
        return answer;
    }

    public static int digitSum(int number) {

        int sum = 0;
        while (true) {

            int i = number % 10;
            number /= 10;
            sum += i;

            if (number == 0) {
                return sum;
            }

        }

    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {

        return (double) Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - x1), 2)));

    }

    public static int countDivisors(int number) {

        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isPerfect(int number) {

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;

    }

    public static void oddMultiplicationTable(int number) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i * j) % 2 != 0) {
                    System.out.print(" " + i * j + " ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }


}