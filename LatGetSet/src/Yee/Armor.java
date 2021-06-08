package Yee;

public class Armor extends Player{

    public Armor(int defense, int health) {
        this.defense = defense;
        this.health = health;
    }

    protected Armor Oby(){
        Armor ar = new Armor(this.defense += 300, this.health += 200);
        this.armor = ar;
        return ar;
    }
    protected Armor Daedric(){
        Armor ar = new Armor(this.defense += 350, this.health += 100);
        this.armor = ar;
        return ar;
    }
}
