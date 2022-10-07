public class Character {
    private String name;
    private int energy;
    private int gold;

    public Character() {

    }

    public Character(String name, int energy, int gold) {
        this.name = name;
        this.energy = energy;
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

    public void setEnergy(int energy) {
        this.energy = energy;
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
        if (this.energy - value < 0) {
            this.energy = 0;
        } else {
            this.energy -= value;
        }
    }

    public void incrementGold(int value) {
        this.gold += value;
    }
    
    public void decrementGold(int value) {
        if (this.gold - value < 0) {
            this.gold = 0;
        } else {
            this.gold -= value;
        }
    }
}
