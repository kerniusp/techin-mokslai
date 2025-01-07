package lt.techin.praktinis;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
        int likePuodeliai = numberOfCups % 3;
        int pilnosDezutes = (numberOfCups - likePuodeliai) / 3;
        System.out.println("Dėžių: "+ pilnosDezutes +"\nLiko puodelių: "+likePuodeliai);

    }

}
