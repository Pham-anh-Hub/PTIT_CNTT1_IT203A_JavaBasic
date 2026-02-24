package KiemtraThuchanh_session11;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[10000];
        int size = 0;
        double total = 0;
        NumberFormat nf = NumberFormat.getNumberInstance();

        drinks[0] = new Coffee(1, "Bạc sỉu", 30000, true); size++;
        drinks[1] = new FruitJuice(2, "Nước cam", 40000, 10);size++;
        drinks[2] = null;size++;

        System.out.println("===== Hóa đơn bán hàng =====");

        for (int i=0; i<size ; i++){
            if(drinks[i] instanceof IMixable){
                System.out.println("----------------------------");
                ((IMixable) drinks[i]).mix();
            }
            if(drinks[i] != null){

                System.out.println("----------------------------");
                drinks[i].displayInfor();
                total += drinks[i].calculatePrice();

            }
        }
        System.out.println("\nThành tiền: " + nf.format(total) + " VND");

    }
}
