package Yee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NullPointerException{

        Player p1 = new Player();
        Weapon weapon1 = new Weapon(p1.attack,p1.crit);
        Armor armor = new Armor(p1.defense, p1.health);
        Scanner s = new Scanner(System.in);

        System.out.print("Pilih Senjata, Pedang atau Pistol ? : ");
        String n1 = s.nextLine();
        if(n1.equalsIgnoreCase("pedang")){
            p1.setWeapon(weapon1.gun());
        }
        else if(n1.equalsIgnoreCase("pistol")){
            p1.setWeapon(weapon1.sword());
        }
        System.out.print("Pilih Armor, Oby atau Daedric ? : ");
        String n2 = s.nextLine();
        if(n2.equalsIgnoreCase("oby")){
            p1.setArmor(armor.Oby());
        }
        else if(n2.equalsIgnoreCase("daedric")){
            p1.setArmor(armor.Daedric());
        }

        System.out.println("Player Stats : ");
        p1.DisplayPlayer();
        System.out.println("Stats after equipping the chosen weapon : ");
        p1.getWeapon().DisplayWeapon();
        System.out.println("Stats after equipping the chosen armor : ");
        p1.getArmor().DisplayArmor();
    }
}

