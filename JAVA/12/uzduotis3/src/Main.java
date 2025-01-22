import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>(List.of(
                new Player("Alice", 15),
                new Player("Bob", 20),
                new Player("Charlie", 20),
                new Player("Daisy", 10)
        )
        );

//        players.forEach((player) -> System.out.println("Player: " + player.getName() + "Score: " + player.getScore()));
//
//        players.removeIf((player) -> player.getScore() < 25);
//        System.out.println(players);

        players.replaceAll((player) -> new Player(player.getName(), player.getScore() * 2));
        System.out.println(players);

        players.sort((player1, player2) -> {

                    if (player1.getScore() - player2.getScore() == 0) {
                        return player1.getName().compareTo(player2.getName());
                    }

                    return player2.getScore() - player1.getScore();

                }
        );
        System.out.println(players);

        players.forEach((player) -> player.setName("Player-" + player.getName()));

        System.out.println(players);

        
    }

}