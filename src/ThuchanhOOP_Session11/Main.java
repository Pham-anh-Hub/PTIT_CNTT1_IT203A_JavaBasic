package ThuchanhOOP_Session11;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo nhân vật
        GameCharactor warrior = new Warrior("Yasuo", 500, 50, 20);
        GameCharactor mage = new Mage("Veigar", 300, 40, 200);
        GameCharactor goblin = new GameCharactor("Goblin", 100, 10) {
            @Override
            void attack(GameCharactor target) {
                System.out.printf("%s cắn trộm %s gây %d sát thương\n", this.name, target.name, attackPower);
                target.takeDamage(attackPower);
            }

            @Override
            public void useUltimate(GameCharactor target) {

            }

            @Override
            void displayInfo() {
                System.out.printf("Tên: %s | Máu: %d", name, hp);
            }
        };

        // Yasuo tấn công Goblin
        warrior.attack(goblin);
        // Veigar dùng chiêu cuối lên Yasuo
        mage.useUltimate(warrior);
        // Goblin (Anonymous Class) tấn công
        goblin.attack(mage);

        // Hiển thị thông tin
        System.out.println("\nTổng số nhân vật đã tạo: " + GameCharactor.count + "\n");
        System.out.println("----- Thông số sau lượt đấu đầu -----");
        warrior.displayInfo();
        mage.displayInfo();
        goblin.displayInfo();

    }
}
