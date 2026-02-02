package PTIT_CNTT1_IT203A_Session07;

import java.text.NumberFormat;
import java.util.Locale;

public class PTIT_CNTT1_IT203A_Session07_Bai4 {

    public static void main(String[] args){
        Classroom classmate1 = new Classroom("Nguyen Van A", 200000);
        Classroom classmate2 = new Classroom("Nguyen Thi B", 210000);
        Classroom classmate3 = new Classroom("Tran Van C", 200000);
        Classroom classmate4 = new Classroom("Nguyen Van D", 250000);

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        System.out.println("Tổng quỹ lớp: " + nf.format(Classroom.classFund) + "VNĐ");
    }
}
