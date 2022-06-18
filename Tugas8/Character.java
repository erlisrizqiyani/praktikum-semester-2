package TugasDelapan;

public abstract class Character {
    private int defense;
    private int attack;
    private int hp;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage) {
        if (damage>getDefense()){
            int sisa = damage - getDefense();
            setHp(getHp() - (sisa));
        }
    }

    public void info(){
        System.out.println("---------- STATUS ----------");
    }

}
