package PTIT_CNTT1_IT203A_Session09.demoKethua;

public class Main {
    public static void main(String[] args){
        // khởi tạo 1 đối tượng của lớp BirdAnimal
        Animal bird = new Bird();
        // insert dữ liệu
        bird.input();
        // display
        bird.display();


        // Khởi tạo 1 đối tượng mammal
        Animal mammal = new Mammal();

        mammal.input();
        mammal.display();
    }
}
