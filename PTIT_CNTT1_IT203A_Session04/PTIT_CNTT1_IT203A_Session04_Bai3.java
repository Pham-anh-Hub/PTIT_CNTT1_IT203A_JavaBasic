package PTIT_CNTT1_IT203A_Session04;

public class PTIT_CNTT1_IT203A_Session04_Bai3 {
    public static void main(String[] args){

        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};


        StringBuilder joinTrans = new StringBuilder();
        String joinTransactions = "";
        long stringBuilderStart = System.currentTimeMillis();
        for(String e : transactions){
            joinTrans.append("Ngày tạo: ");
            joinTrans.append(e).append("\n");
        }
        long stringBuilderEnd = System.currentTimeMillis();

        long stringStart = System.currentTimeMillis();
        for(String e : transactions){
            joinTransactions += "Ngày tạo: ";
            joinTransactions += e+"\n";
        }
        long stringEnd = System.currentTimeMillis();

        System.out.println("--- BÁO CÁO MƯỢN SÁCH ---");
        System.out.println("Ngày tạo: " + System.currentTimeMillis());
        System.out.println(joinTrans);
        System.out.println("Số thời gian thực thi đối với String: " + (stringEnd - stringStart));
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (stringBuilderEnd - stringBuilderStart));

    }
}
