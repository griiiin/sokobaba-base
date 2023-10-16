import java.util.ArrayList;

public class Player extends Combatant implements CanMove {
    private int hp;
    private int x;
    private int y;

    public Player (int x, int y) {
        hp = 10;
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean isPos (int x, int y) {
        return this.x == x && this.y == y;
    }
    @Override
    public boolean move (int vx, int vy, ArrayList<Entity> entities, Game game) {
        //check if other entities occupy the moved to tile
        for (Entity e: entities) {
            if (e.isPos(this.x+vx, this.y+vy) && !(e instanceof Player)){
                //only 1 entity can occupy a tile
                System.out.println("Player can't move there");
                return false;
            }
        }
        //check if oob
        if (this.x+vx < 0 || this.x+vx > game.getMaxX() || this.y+vy < 0 || this.y+vy > game.getMaxY()) {
            System.out.println("Player can't move out-of-bounds");
            return false;
        }
        this.x += vx;
        this.y += vy;
        System.out.println("The player moved to " + this.x + ", " + this.y);
        return true;
    }
}
