package TugasDelapan;

import java.util.Random;

public class Healer extends Character{

    public Healer(){
        setDefense(10);
        setAttack(10);
        setHp(70);
    }

    @Override
    public boolean attack() {
        Random r = new Random();
        if(r.nextInt(100)+1<=85) {
            return true;
        }else return false;
    }

    public void heal(){
        setHp(getHp()+25);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Healer");
        System.out.println("HP\t: " + getHp());
        System.out.println("Attack\t: "
                + getAttack());
        System.out.println("Defense\t: "
                + getDefense());
    }
}
