package PTIT_CNTT1_IT203A_Session14;

import java.util.*;

public class PTIT_CNTT1_IT203A_Session14_Bai6 {
    public static Map<String, List<PatientTreatment>> patientTreatment = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin bệnh nhân (x hoặc 0 để thoát): ");
        while(true){

            System.out.print("Khoa điều trị: ");
            String department = sc.nextLine().trim().toUpperCase();
            if(department.equalsIgnoreCase("x")){
                break;
            }
            System.out.print("Tên bệnh nhân: ");
            String fullname = sc.nextLine().trim();
            if(fullname.equalsIgnoreCase("x")){
                break;
            }
            System.out.print("Tuổi: ");
            int age = sc.nextInt();
            if(age == 0){
                break;
            }
            sc.nextLine();
            System.out.println("-----------------------------------\n");

            PatientTreatment newPatient = new PatientTreatment(fullname, age, department);

            if (!patientTreatment.containsKey(department)) {
                patientTreatment.put(department, new ArrayList<>());
            }
            patientTreatment.get(department).add(newPatient);

        }
        displayPatients();
    }

    public static void displayPatients (){
        int count = 0, maxCount = 0;
        String maxMajor = null;
        System.out.println("=========================");
        System.out.println("Thống kê: ");
        String[] keys = patientTreatment.keySet().toArray(new String[0]);
        for (String k : keys){
            System.out.println("\n" + k + ": ");
            count = 0;
            for(PatientTreatment pt : patientTreatment.get(k)){
                System.out.print(pt.toString());
                count++;
                System.out.print("\n");
            }
            if(count > maxCount){
                maxCount = count;
                maxMajor = k;
            }

        }
        System.out.println("\nKhoa đông bệnh nhân nhất: " + maxMajor.toUpperCase() + " (" + maxCount + " bệnh nhân)");
    }
}
