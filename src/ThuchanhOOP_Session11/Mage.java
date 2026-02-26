package ThuchanhOOP_Session11;

public class Mage extends GameCharactor{
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    // Đánh thường
    @Override
    void attack(GameCharactor target) {

        System.out.println(name + " niệm phép tấn công " + target.getName());

        if (mana >= 5) {
            mana -= 5;
            target.takeDamage(attackPower);
        } else {
            int reducedDamage = attackPower / 2;
            target.takeDamage(reducedDamage);
//            System.out.println("Hết mana! Gây sát thương yếu: " + reducedDamage);
        }
//        target.displayInfo();
    }

    // Chiêu cuối
    @Override
    public void useUltimate(GameCharactor target) {

        if (mana >= 50) {
            mana -= 50;

            int damage = attackPower * 3; // sát thương khủng khiếp
            System.out.println(name + " tung Hỏa Cầu!");
            target.takeDamage(damage);

        } else {
            System.out.println("Không đủ mana để dùng Hỏa Cầu!");
        }
    }


    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.print(" | Mana: " + this.mana + "\n");
    }
}
