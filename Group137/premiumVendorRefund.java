public class premiumVendorRefund implements RefundPolicy {
    public double calculateRefund(double amountPaid, LocalDate serviceDate, LocalDate cancelDate){
        long daysBefore = java.time.temporal.ChronoUnit.DAYS.between (cancelDate, serviceDate);
        return daysBefore >= 3 ? amountPaid * 0.8 : 0.0;

    }
}
