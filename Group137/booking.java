import java.time.LocalDate;
public class booking {
    private int bookingId;
    private int clientId;
    private int vendorId;
    private LocalDate bookingDate;
    private LocalDate serviceDate;
    private boolean confirmed;
    private boolean cancelled;
    private double amountPaid;
    private double refundAmount;

    public booking(int bookingId, int clientId, int vendorId, LocalDate bookingDate, LocalDate serviceDate) {
        this.bookingId = bookingId;
        this.clientId = clientId;
        this.vendorId = vendorId;
        this.bookingDate = bookingDate;
        this.serviceDate = serviceDate;
        this.confirmed = false;
        this.cancelled = false;
        this.amountPaid = 0.0;
        this.refundAmount = 0.0;
    }
    public int getBookingId() { return bookingId; }
    public int getClientId() { return clientId; }
    public int getVendorId() { return vendorId; }
    public LocalDate getBookingDate() { return bookingDate; }
    public LocalDate getServiceDate() { return serviceDate; }
    public boolean isConfirmed() { return confirmed; }
    public boolean isCanceled() { return canceled; }
    public double getAmountPaid() { return amountPaid; }
    public double getRefundAmount() { return refundAmount; }

    public void setConfirmed(boolean confirmed) { this.confirmed = confirmed; }
    public void setCanceled(boolean canceled) { this.canceled = canceled; }
    public void setAmountPaid(double amountPaid) { this.amountPaid = amountPaid; }
    public void setRefundAmount(double refundAmount) { this.refundAmount = refundAmount; }

    public String toString() {
        return String.join("|",
                bookingId, clientId, vendorId,
                bookingDate.toString(),
                serviceDate.toString(),
                String.valueOf(confirmed),
                String.valueOf(canceled),
                String.valueOf(amountPaid),
                String.valueOf(refundAmount)
        );
    }
}
