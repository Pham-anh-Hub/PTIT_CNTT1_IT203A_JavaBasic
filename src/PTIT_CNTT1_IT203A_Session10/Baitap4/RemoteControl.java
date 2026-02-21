package PTIT_CNTT1_IT203A_Session10.Baitap4;

public interface RemoteControl {

    void powerOn();

    default void checkBattery(){
        System.out.println("Pin ổn định");
    }
}
