import java.util.ArrayList;
import java.util.Collections;

public class Game implements Comparable<Entity>{
    private int turns;
    private boolean turnUsed;
    private final int maxX;
    private final int maxY;
    private boolean active;

    public Game (int maxX, int maxY) {
        this.maxX = maxX-1;
        this.maxY = maxY-1;
        turnUsed = false;
        turns = 0;
        active = true;
    }

    public int getTurns() {
        return turns;
    }

    public boolean isTurnUsed() {
        return turnUsed;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setTurnUsed(boolean turnUsed) {
        this.turnUsed = turnUsed;
    }

    boolean isActive () {
        System.out.println("game.isActive: " + active);
        return active;
    }
    void incTurns (boolean a) {
        if (a) {
            turns++;
            turnUsed = true;
        }
    }
    void quit () {
        System.out.println("Quitting game...");
        active = false;
    }
    /*void sortEntities (ArrayList<Entity> entityArrayList) {
        Collections.sort(entityArrayList, compareTo());
    }*/
    void printStage (ArrayList<Entity> entityArrayList) {
        setTurnUsed(false);
        System.out.println("Turns: " + getTurns());
        for (int y = 0; y <= maxY; y++) {
            for (int x = 0; x <= maxX; x++) {
                for (Entity e: entityArrayList) {
                    if (e.isPos(x, y) && e instanceof Player){
                        System.out.print(" @");
                        break;
                    }
                    System.out.print(" .");
                }
            }
            System.out.println();
        }
    }

    @Override
    public int compareTo(Entity o) {
        return 0;
    }
}
