package ThuchanhOOP_Session11;

public class Main {

    public static void main(String[] args) {

        GameCharactor[] charactors = new GameCharactor[6];

        charactors[0] = new Warrior("Yasuo", 500, 50, 20);
        charactors[1] = new Warrior("Zuka", 600, 45, 18);
        charactors[2] = new Warrior("Yena", 650, 40, 25);
        charactors[3] = new Mage("Veigar", 300, 50, 200);
        charactors[4] = new Mage("Tulen", 350, 65, 200);

        charactors[5] = new GameCharactor("Goblin", 100, 10) {
            @Override
            void attack(GameCharactor target) {
                System.out.printf("%s cắn trộm %s gây %d sát thương\n",
                        this.name, target.name, attackPower);
                target.takeDamage(attackPower);
            }

            @Override
            public void useUltimate(GameCharactor target) {
                System.out.println(name + " không có chiêu cuối!");
            }

            @Override
            void displayInfo() {
                System.out.printf("Tên: %s | Máu: %d\n", name, hp);
            }
        };

        int size = charactors.length;

        System.out.println("===== BẮT ĐẦU LƯỢT ĐẤU =====");

        while (size > 1) {

            int attackerIndex = (int)(Math.random() * size);
            int targetIndex;

            do {
                targetIndex = (int)(Math.random() * size);
            } while (targetIndex == attackerIndex);

            GameCharactor attacker = charactors[attackerIndex];
            GameCharactor target = charactors[targetIndex];

            System.out.println("\n---------------------------------");
            System.out.println(attacker.name + " VS " + target.name);
            System.out.println("---------------------------------");

            // Combat từng lượt
            while (attacker.hp > 0 && target.hp > 0) {

                attackTurn(attacker, target);

                if (target.hp <= 0) break;

                attackTurn(target, attacker);

                System.out.println();
            }

            // Xử lý người chết
            if (attacker.hp <= 0) {
                System.out.println(attacker.name + " bị hạ gục!\n");
                size = removeHero(charactors, size, attackerIndex);
            } else if (target.hp <= 0) {
                System.out.println(target.name + " bị hạ gục!\n");
                size = removeHero(charactors, size, targetIndex);
            }
        }

        System.out.println("=====================================");
        System.out.println(charactors[0].name + " chiến thắng !!!");
    }


    static void attackTurn(GameCharactor attacker, GameCharactor target) {
        int ultiPercent = (int)(Math.random() * 100);

        if (ultiPercent > 45) {
            attacker.useUltimate(target);
        } else {
            attacker.attack(target);
        }
    }


    static int removeHero(GameCharactor[] arr, int currentSize, int removeIndex) {

        for (int i = removeIndex; i < currentSize - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[currentSize - 1] = null;

        return currentSize - 1;
    }
}