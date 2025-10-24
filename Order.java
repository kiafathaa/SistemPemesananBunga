public class Order {
    private Customer customer;
    private Flower flower;
    private int jumlah;
    private Payment payment;

    public Order(Customer customer, Flower flower, int jumlah) {
        this.customer = customer;
        this.flower = flower;
        this.jumlah = jumlah;
    }

    public double calculateTotal() {
        return flower.getHarga() * jumlah;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void displayOrder() {
        System.out.println("Nama Customer : " + customer.getNama());
        System.out.println("Nomor HP      : " + customer.getNoHp());
        System.out.println("Bunga         : " + flower.getNama());
        System.out.println("Jumlah        : " + jumlah);
        System.out.println("Total Harga   : Rp " + calculateTotal());
        if (payment != null) {
            System.out.println("Status        : " + payment.getStatus());
        } else {
            System.out.println("Status        : BELUM BAYAR");
        }
    }
}
