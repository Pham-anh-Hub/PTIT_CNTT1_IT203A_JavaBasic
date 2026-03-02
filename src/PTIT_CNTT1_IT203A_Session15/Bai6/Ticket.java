package PTIT_CNTT1_IT203A_Session15.Bai6;

// Hệ thống gọi số tự động

import java.time.LocalDateTime;

// Lưu thông tin một số thứ tự khám.
public class Ticket {
    public int ticketNumber; // số thứ tự
    public LocalDateTime issuedTime; // thời điểm phát số


    public Ticket(int ticketNumber, LocalDateTime issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    @Override
    public String toString() {
        return "Số: " + ticketNumber + " - " + issuedTime;
    }
}
