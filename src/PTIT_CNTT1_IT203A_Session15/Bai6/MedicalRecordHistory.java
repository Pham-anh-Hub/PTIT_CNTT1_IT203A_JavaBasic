package PTIT_CNTT1_IT203A_Session15.Bai6;


import PTIT_CNTT1_IT203A_Session15.Bai1.EditAction;

import java.util.LinkedList;
import java.util.Stack;

// Quản lý lịch sử chỉnh sửa bệnh án bằng Stack.
public class MedicalRecordHistory {
    public Stack<EditActions> editStack =  new Stack<>(); // ngăn xếp các đối tượng EditAction
    public String recordId; // mã bệnh án


    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditActions action) {
        this.editStack.push(action);
    }

    public EditActions undoEdit() {
        if (!this.editStack.isEmpty()) {
            return this.editStack.pop();
        }
        return null;
    }
}
