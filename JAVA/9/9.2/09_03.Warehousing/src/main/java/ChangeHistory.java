import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> listOfChangeHistory;


    public ChangeHistory() {
        this.listOfChangeHistory = new ArrayList<>();
    }

    public void add(double status) {

        listOfChangeHistory.add(status);
    }

    public void clear() {

        for (int i = 0; i < listOfChangeHistory.size(); i++) {
            listOfChangeHistory.remove(i);
        }
    }

    public double maxValue() {
        double biggestValue = 0;

        for (int i = 0; i < listOfChangeHistory.size(); i++) {
            if (biggestValue < listOfChangeHistory.get(i)) {
                biggestValue = listOfChangeHistory.get(i);
            }
        }

        return biggestValue;
    }

    public double minValue() {

        double smallestValue = 0;

        for (int i = 0; i < listOfChangeHistory.size(); i++) {
            if (smallestValue > listOfChangeHistory.get(i)) {
                smallestValue = listOfChangeHistory.get(i);
            }
        }

        return smallestValue;
    }

    public double average() {

        double averageValue = 0;

        for (int i = 0; i < listOfChangeHistory.size(); i++) {
            averageValue += listOfChangeHistory.get(i);
        }

        return averageValue / listOfChangeHistory.size();

    }

    @Override
    public String toString() {
        return "[" + listOfChangeHistory + "]";

    }
}
