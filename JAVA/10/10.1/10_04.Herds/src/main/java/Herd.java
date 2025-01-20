import java.util.ArrayList;

public class Herd implements Movable{

    private ArrayList<Movable> listOfOrganism = new ArrayList<>();

    public void addToHerd(Movable movable){
        listOfOrganism.add(movable);
    }

    @Override
    public void move(int dx, int dy) {

        for(int i = 0; i < listOfOrganism.size(); i++){
           listOfOrganism.get(i).move(dx,dy);
            System.out.println("Moved element " + listOfOrganism.get(i));
        }

    }



    @Override
    public String toString() {
        String answer = "";
        for(int i = 0; i < listOfOrganism.size(); i++){
            answer += listOfOrganism.get(i) + "\n";
        }
        return answer;
    }
}
