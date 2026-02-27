package PTIT_CNTT1_IT203A_Session13;

import java.util.LinkedList;
import java.util.Scanner;

public class EmergencyRoom {
    public static LinkedList<String> patients = new LinkedList<>();
    public static int normalCount = 0;
    public static int emergencyCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        patientCheckin("A");
        patientCheckin("B");
        emergencyCheckin("C");



        System.out.println("Output: ");
        int k=0;
        for (int i = 0; i < emergencyCount; i++) {
            System.out.println((k+1) + ".Đang cấp cứu:  " + patients.get(k++));
        }
        for (int i = 0; i < normalCount; i++) {
            System.out.println((k+1) + ".Đang khám:  " + patients.get(k++));
        }
        treatPatient();
        treatPatient();
        treatPatient();

    }

    public static void patientCheckin(String name){
        patients.addLast(name);
        normalCount++;
    }
    public static void emergencyCheckin(String name){
        patients.addFirst(name);
        emergencyCount++;
    }

    public static void  treatPatient(){
//        System.out.println(patients.get(0));
        patients.remove(0);
    }
}
