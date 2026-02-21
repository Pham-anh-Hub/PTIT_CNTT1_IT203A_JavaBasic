package PTIT_CNTT1_IT203A_Session10.Baitap4;

public class BaiTap4_main {
    public static void main(String[] args) {
        // Đối tượng tạo từ interface
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }

            @Override
            public void checkBattery() {
                RemoteControl.super.checkBattery();
            }
        };
        smartLight.checkBattery();
        smartLight.powerOn();


    }
}
