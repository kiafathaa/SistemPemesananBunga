import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FlowerShop shop = new FlowerShop();

        System.out.println("=== SISTEM PEMESANAN BUNGA ===");

        System.out.print("Masukkan Nama Pelanggan: ");
        String name = input.nextLine();
        System.out.print("Masukkan No. Telepon: ");
        String phone = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        String address = input.nextLine();

        Customer customer = new Customer(name, phone, address);

        shop.displayFlowers();
        System.out.print("Pilih nomor bunga: ");
        int choice = input.nextInt();
        Flower selectedFlower = shop.getFlower(choice - 1);

        System.out.print("Masukkan jumlah pembelian: ");
        int quantity = input.nextInt();

        Order order = new Order(customer, selectedFlower, quantity);
        order.displayOrder();

        Payment payment = new Payment(order.calculateTotal());
        payment.processPayment();
    }
}
