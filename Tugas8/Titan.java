package TugasDelapan;
import java.util.Random;

public class Titan extends Character{

    public Titan(){
        setAttack(45);
        setHp(200);
    }

    @Override
    public boolean attack() {
        Random r = new Random();
        if (r.nextInt(100)+1<=40) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Titan");
        System.out.println("HP\t: " + getHp());
        System.out.println("Attack\t: " + getAttack());
        System.out.println("Defense\t: " + getDefense());
    }
}

