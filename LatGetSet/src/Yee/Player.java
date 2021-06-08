package Yee;

public class Player {

    int health, defense, attack, crit;
    String name;
    public Weapon weapon;
    public Armor armor;

    public Player(){
        this.health = 500;
        this.defense = 100;
        this.name = "Anwyll";
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public Weapon getWeapon(){
        return this.weapon;
    }
    public void setArmor(Armor armor){
        this.armor = armor;
    }
    public Armor getArmor(){
        return this.armor;
    }
    public void DisplayPlayer(){
        System.out.println("Name : " + this.name + "\nHealth : " + this.health
        + "\nDefense : " + this.defense + "\nAttack : " + this.attack + "\nCrit : " + this.crit);
    }
    public void DisplayArmor(){
        System.out.println("Health : " + this.health + "\nDefense : " + this.defense);
    }
    public void DisplayWeapon(){
        System.out.println("Attack : " + this.attack + "\nCrit : " + this.crit);
    }
}
