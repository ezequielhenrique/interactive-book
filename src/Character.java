public class Character {
    private String name;
    private int energy = 100;
    private int gold;

    public Character() {

    }

    public Character(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return this.energy;
    }

    public int getGold() {
        return this.gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void incrementEnergy(int value) {
        this.energy += value;
    }
    
    public void decrementEnergy(int value) {
        this.energy -= value;
    }

    public void incrementGold(int value) {
        this.gold += value;
    }
    
    public void decrementGold(int value) {
        this.gold -= value;
    }
}
