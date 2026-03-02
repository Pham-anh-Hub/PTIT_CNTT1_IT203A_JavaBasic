package PTIT_CNTT1_IT203A_Session15.Bai6;

import java.util.Stack;

public class UndoManager {
    public Stack<InputActions> undoStack = new Stack<>();
    public int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputActions action) {
        if (undoStack.size() >= maxUndoSteps) {
            undoStack.remove(0); // xóa thao tác cũ nhất
        }
        undoStack.push(action);
    }

    public InputActions undo() {
        if (!undoStack.isEmpty()) {
            return undoStack.pop();
        }
        return null;
    }


}
