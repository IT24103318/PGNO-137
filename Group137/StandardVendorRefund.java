public interface StandardVendorRefund{
    double calculateRefund(double amountPaid, LocalDate serviceDate, LocalDate cancelDate);

}

public class StandardVendorRefund implements RefundPolicy {
    @java.lang.Override
    public double calculateRefund(double amountPaid, LocalDate serviceDate, LocalDate cancelDate) {
        long daysBefore = java.time.temporal.ChronoUnit.DAYS.between(cancelDate, serviceDate);
        return daysBefore >= 7 ? amountPaid * 0.5 : 0.0;

    }
}

