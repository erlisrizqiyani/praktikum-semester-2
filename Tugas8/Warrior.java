package TugasDelapan;

import java.util.Random;

public class Warrior extends Character{
    public Warrior(){
        setDefense(30);
        setAttack(25);
        setHp(80);
    }

    @Override
    public boolean attack() {
        Random r = new Random();
        if(r.nextInt(100)+1 <= 60) {
            return true;
        }else return false;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Warrior");
        System.out.println("HP\t: " + getHp());
        System.out.println("Attack\t: " + getAttack());
        System.out.println("Defense\t: " + getDefense());
    }
}
