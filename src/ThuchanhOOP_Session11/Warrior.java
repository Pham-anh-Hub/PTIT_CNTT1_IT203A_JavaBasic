package ThuchanhOOP_Session11;

public class Warrior extends GameCharactor implements ISkill{
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    // Đánh thường
    @Override
    void attack(GameCharactor target) {
        System.out.println(name + " tấn công " + target.getName());
        target.takeDamage(attackPower);
    }

    // Chiêu cuối
    @Override
    public void useUltimate(GameCharactor target) {
        System.out.println(name + " dùng Đấm ngàn cân!");

        int damage = attackPower * 2;
        target.takeDamage(damage);

        // Mất 10% HP hiện tại
        int selfDamage = hp * 10 / 100;
        this.hp -= selfDamage;

        System.out.println(name + " bị mất " + selfDamage + " máu do gắng sức!");
    }


    // Bị đánh
    @Override
    void takeDamage(int amount) {
        int realDamage = amount - armor;
        if (realDamage < 0) realDamage = 0;

        System.out.println(name + " giảm " + armor + " sát thương nhờ giáp.");

        super.takeDamage(realDamage);
    }


}
