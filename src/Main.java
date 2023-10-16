import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game(4, 4);
        ArrayList<Entity> entities = new ArrayList<>();
        String input;
        Player p = new Player(3, 3);
        entities.add(p);

        while (game.isActive()) {
            game.printStage(entities);
            System.out.println("What do? move(u/d/l/r), exit(x): ");
            input = sc.nextLine();
            while (game.isTurnUsed()) {
                switch (input) {
                    //case "u":
                    case "w":
                        System.out.println("Moving Up...");
                        game.incTurns(p.move(0, -1, entities, game));
                        break;
                    //case "d":
                    case "s":
                        System.out.println("Moving Down...");
                        game.incTurns(p.move(0, 1, entities, game));
                        break;
                    ///case "l":
                    case "a":
                        System.out.println("Moving Left...");
                        game.incTurns(p.move(-1, 0, entities, game));
                        break;
                    //case "r":
                    case "d":
                        System.out.println("Moving Right...");
                        game.incTurns(p.move(1, 0, entities, game));
                        break;
                    case "":
                        System.out.println("Waiting...");
                        game.incTurns(true);
                        break;
                    case "x":
                        game.quit();
                        return;
                    default:
                        System.out.println("Unknown Input");
                        break;
                }
            }
        System.out.println("----------------------------------------");
        }
    }
}

