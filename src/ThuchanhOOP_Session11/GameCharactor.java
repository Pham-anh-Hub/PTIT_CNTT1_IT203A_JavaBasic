package ThuchanhOOP_Session11;

public abstract class GameCharactor  {
    String name;
    int hp;
    int attackPower;
    static int count;

    public GameCharactor(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }


    abstract void attack(GameCharactor target);

    void takeDamage(int amount){
        if(hp <= 0 ){
            System.out.println("Đã bị hạ gục");
            return;
        }
        hp -= amount;
        System.out.println(name + " bị tấn công");
    }

    // Chiêu cuối
    public abstract void useUltimate(GameCharactor target);

    void displayInfo(){
        System.out.println("Tên nhân vật: " + this.name);
        System.out.println("Máu hiện tại: " + this.hp);
        System.out.println("Lực tấn công: " + this.attackPower);
    }

}
