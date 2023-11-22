public class Item extends Entity{
    private int itemId;

    protected Item(int x, int y, int itemId) {
        super(x, y);
        this.itemId = itemId;
    }
}
