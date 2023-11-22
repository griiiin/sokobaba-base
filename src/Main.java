import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // >:<
        Scanner sc = new Scanner(System.in);
        Game game = new Game(5, 5);
        ArrayList<Entity> entities = new ArrayList<>();
        String input;
        Player p = new Player(3, 3, 10);
        entities.add(p);

        while (game.isActive()) {
            //System.out.println("game.isActive: " + game.isActive());
            game.printStage(entities);
            while (!game.isTurnUsed()) {
                System.out.println("What do? move(w/s/a/d), exit(x): ");
                input = sc.nextLine();
                try {
                    switch (input) {
                        //case "u":
                        case "w":
                            System.out.println("Moving Up...");
                            p.move(0, -1, entities, game);
                            break;
                        //case "d":
                        case "s":
                            System.out.println("Moving Down...");
                            p.move(0, 1, entities, game);
                            break;
                        ///case "l":
                        case "a":
                            System.out.println("Moving Left...");
                            p.move(-1, 0, entities, game);
                            break;
                        //case "r":
                        case "d":
                            System.out.println("Moving Right...");
                            p.move(1, 0, entities, game);
                            break;
                        case "":
                        case " ":
                            System.out.println("Waiting...");
                            game.incrementTurns(true);
                            break;
                        case "x":
                            game.quit();
                            return;
                        default:
                            throw new IllegalArgumentException("Unknown Input");
                    }
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage());
                }
            }
        System.out.println("----------------------------------------");
        }
    }
}

