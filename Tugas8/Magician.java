package TugasDelapan;
import java.util.Random;

public class Magician extends Character{

    public Magician() {
        setDefense(10);
        setAttack(60);
        setHp(100);
    }

    @Override
    public boolean attack() {
        Random r = new Random();
        if(r.nextInt(100)+1<=35){
            return true;
        }else return false;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Magician");
        System.out.println("HP\t: " + getHp());
        System.out.println("Attack\t: "
                + getAttack());
        System.out.println("Defense\t: "
                + getDefense());
    }
}
