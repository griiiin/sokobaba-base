public abstract class Combatant extends Entity {
    private double hp;

    public Combatant(int x, int y, double hp) {
        super(x, y);
        this.hp = hp;
    }

    public double getHp() { return hp; }
}
