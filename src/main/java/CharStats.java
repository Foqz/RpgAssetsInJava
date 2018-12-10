import java.util.Random;

public class CharStats {
    private int intelligence;
    private int strength;
    private int dexterity;


    public CharStats() {
        int maxBaseStat = 10;
        Random rn = new Random();
        this.intelligence = rn.nextInt(10) + maxBaseStat;
        this.strength = rn.nextInt(10) + maxBaseStat;
        this.dexterity = rn.nextInt(10) + maxBaseStat;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }
}
