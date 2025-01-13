package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

//
//        reverseInPlace(arr);
        int[] arrWithRemovedElement = removeElementAndReturnNewArray(arr, 1);
//        System.out.println(Arrays.toString(arrWithRemovedElement));
//        System.out.println(Arrays.toString(reverseArray(arr)));
//        System.out.println(Arrays.toString(generateRandomArray(5, 0, 10)));


    }

    // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
    // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {
        //TODO
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * ((max - min) + 1)) + min;
        }
        return arr;
    }


    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {
        //TODO

        if (k > arr.length) {
            
        }

        return null;
    }

    //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x) {
        //TODO


        return null;
    }

    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {
        //TODO

        int[] newArray = new int[arr.length];
        int arrayLength = arr.length;
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arrayLength - 1];
            arrayLength--;

        }
        return newArray;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace(int[] arr) {
        //TODO
        int storage = 0;
        int arrayLength = arr.length;
        for (int i = 0; i < arr.length / 2; i++) {

            storage = arr[i];
            arr[i] = arr[arrayLength - 1];
            arr[arrayLength - 1] = storage;
            System.out.println(arr[arrayLength - 1]);

            arrayLength--;

        }
        System.out.println(Arrays.toString(arr));

    }


}
