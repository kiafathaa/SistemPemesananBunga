public class Payment {
    private double totalAmount;

    public Payment(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void processPayment() {
        System.out.println("Pembayaran sebesar Rp" + totalAmount + " berhasil diproses!");
    }
}
