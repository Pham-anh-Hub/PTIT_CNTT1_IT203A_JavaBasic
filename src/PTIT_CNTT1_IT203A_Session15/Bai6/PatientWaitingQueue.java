package PTIT_CNTT1_IT203A_Session15.Bai6;

import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {

    public Queue<Patient> waitingQueue = new LinkedList<>();
    public int totalPatients = 0;

    public void addPatient(Patient p) {
        waitingQueue.offer(p);
        totalPatients++;
    }

    public Patient callNextPatient() {
        if (!waitingQueue.isEmpty()) {
            totalPatients--;
            return waitingQueue.poll();
        }
        return null;
    }

}


