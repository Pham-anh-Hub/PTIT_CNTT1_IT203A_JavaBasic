package PTIT_CNTT1_IT203A_Session15.Bai1;

import java.time.LocalTime;

public class EditAction {
    private String description;
    private LocalTime time;

    public EditAction(String description, LocalTime time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
