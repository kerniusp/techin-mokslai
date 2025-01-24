public class Main {

    public static void main(String[] args) {
        // Test your program here
        IOU mattsIOU = new IOU();

        mattsIOU.setSum("Artur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Artur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

    }

}
