public abstract class Entity {
    private int x;
    private int y;

   public boolean isPos (int x, int y) {
        return this.x == x && this.y == y;
   }

}

