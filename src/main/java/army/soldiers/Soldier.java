package army.soldiers;

public abstract class Soldier {

    private int health;
    private int speed;
    private Object[] inventory;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Object[] getInventory() {
        return inventory;
    }

    public void setInventory(Object[] inventory) {
        this.inventory = inventory;
    }

    public abstract void makePrimaryAction();
}
