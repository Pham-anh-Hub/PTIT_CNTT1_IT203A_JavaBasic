package PTIT_CNTT1_IT203A_Session04;


public class PTIT_CNTT1_IT203A_Session04_demo {
    public static void main(String[] args){
        String[] names = new String[]{"anh", "bcd", "efg", "ihk"};
        for(int i=0; i<names.length-1; i++){
            for (int j=i+1; j<names.length; j++){
                if(names[i].compareTo(names[j]) > 0){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        for (String e : names){
            System.out.print(e + " ");
        }
    }
}
