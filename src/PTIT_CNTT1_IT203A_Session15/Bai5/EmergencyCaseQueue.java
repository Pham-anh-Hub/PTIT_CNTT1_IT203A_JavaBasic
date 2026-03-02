package PTIT_CNTT1_IT203A_Session15.Bai5;

import java.util.*;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        this.cases = new LinkedList<>();
    }


    void addCase(EmergencyCase c){
        this.cases.offer(c);
    }

    EmergencyCase getNextCase(){
        return this.cases.poll();
    }
}
