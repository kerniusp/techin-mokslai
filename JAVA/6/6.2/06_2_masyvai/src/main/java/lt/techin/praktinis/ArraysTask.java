package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        System.out.println(25 % 10);


        int[] arr = {3, 2, 1, 4, 6, 5};

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

        System.out.println(getFirstElement(arr) + " first element");
        System.out.println(getLastElement(arr) + " last element");
        System.out.println(getMin(arr) + " smallest int");
        System.out.println(getMax(arr) + " didziausias");
        System.out.println(getSum(arr) + " suma");
        System.out.println(getAverage(arr));
        System.out.println(lastIndexOf(arr, 3));

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        //TODO
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        //TODO
        return arr[arr.length - 1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        //TODO
        int maziausias = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maziausias > arr[i]) {
                maziausias = arr[i];
            }
        }
        return maziausias;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        //TODO
        int didziausias = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (didziausias < arr[i]) {
                didziausias = arr[i];
            }
        }

        return didziausias;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        //TODO
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        //TODO
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;

        return avg;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        //TODO
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                counter++;
            }
        }
        return counter;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        //TODO
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }

        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        //TODO
        int counter = 0;
        int lastIndexOf = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n) {
                lastIndexOf = counter;
            }
            counter++;
        }
        return lastIndexOf;
    }


}
