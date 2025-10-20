public class Order {
    private Customer customer;
    private Flower flower;
    private int quantity;

    public Order(Customer customer, Flower flower, int quantity) {
        this.customer = customer;
        this.flower = flower;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return flower.getPrice() * quantity;
    }

    public void displayOrder() {
        System.out.println("\n=== Detail Pesanan ===");
        customer.displayCustomerInfo();
        System.out.println("Bunga Dipesan : " + flower.getName());
        System.out.println("Jumlah        : " + quantity);
        System.out.println("Total Harga   : Rp" + calculateTotal());
    }
}
