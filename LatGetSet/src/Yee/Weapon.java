package Yee;

public class Weapon extends Player {

    public Weapon(int attack, int crit){
        this.attack = attack;
        this.crit = crit;
    }

    protected Weapon gun(){
        Weapon w = new Weapon(this.attack += 250, 20);
        this.weapon = w;
        return w;
    }
    protected Weapon sword(){
        Weapon w = new Weapon(this.attack += 150, 50);
        this.weapon = w;
        return w;
    }
}
