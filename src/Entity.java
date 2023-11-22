import java.util.ArrayList;

public abstract class Entity {
    protected int x;
    protected int y;

    protected Entity (int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected boolean isPos (int x, int y) {
        return this.x == x && this.y == y;
   }
    public void move(int vx, int vy, ArrayList<Entity> entities, Game game) {
        //check if other entities occupy the moved to tile
        for (Entity e: entities) {
            if (e.isPos(this.x+vx, this.y+vy) && !(e instanceof Player)){
                //only 1 entity can occupy a tile
                throw new IllegalArgumentException("Another Entity Blocks the way");
                //System.out.println("Player can't move there");
            }
        }
        //check if oob
        if (this.x+vx < 0 || this.x+vx > game.getMaxX() || this.y+vy < 0 || this.y+vy > game.getMaxY()) {
            throw new IllegalArgumentException("Movement leads player out-of-bounds");
            //System.out.println("Player can't move out-of-bounds");
        }
        this.x += vx;
        this.y += vy;
        System.out.println("The player moved to " + this.x + ", " + this.y);
        game.incrementTurns(true);
    }
}

