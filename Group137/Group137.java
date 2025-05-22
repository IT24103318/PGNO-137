//CRUD operation
//Book a vendor
public void Group137 (int clientId, int vendorId, LocalDate serviceDate){
    int bookingId = UUID.randomUUID().toint();
    LocalDate bookingDate = LocalDate.now();
    Booking booking = new Booking (bookingId, clientId, vendorId, bookingDate, serviceDate);
}

//Confirm booking
public void Group137(int bookingId){
    List <Booking> bookings = readBookings();
    for (Booking b : bookings) {
        if (b.getBookingId().equals(booingId)){
            b.setConfirmed(true);
            break;
        }
    }
}

//Cancel booking and refund
public static void main(int bookingId, RefundPolicy[] args) {
    List<Booking> bookings = readBookings();
    for (Booking b : bookings){
        if (b.getBookingId().equals(bookingId) && !b.isCanceled()){
            LocalDate cancelDate = LocalDate.now();
            double refund = policy.calculateRefund(b.getAmountPaid(), b.getServiceDate(), cancelDate);
            b.setCanceled(true);
            b.setRefundAmount(refund);
            break;
        }
    }

}