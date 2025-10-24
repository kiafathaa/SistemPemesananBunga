import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FlowerShop shop = new FlowerShop();

        System.out.println("=== SISTEM PEMESANAN BUNGA ===");
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nomor HP: ");
        String noHp = input.nextLine();

        Customer customer = new Customer(nama, noHp);

        System.out.println("\nDaftar Bunga:");
        shop.displayFlowers();

        System.out.print("Pilih bunga (1-" + shop.getFlowers().size() + "): ");
        int index = input.nextInt() - 1;

        System.out.print("Masukkan jumlah: ");
        int jumlah = input.nextInt();

        Flower flower = shop.getFlower(index);
        if (flower == null) {
            System.out.println("Pesanan gagal, bunga tidak ditemukan.");
            return;
        }

        Order order = new Order(customer, flower, jumlah);

        double total = order.calculateTotal();
        System.out.println("\nTotal: Rp " + total);

        System.out.print("Lanjut ke pembayaran? (y/n): ");
        char pilih = input.next().toLowerCase().charAt(0);

        if (pilih == 'y') {
            Payment payment = new Payment(total);
            payment.konfirmasiPembayaran(true);
            order.setPayment(payment);

            System.out.println("\n===== DETAIL PESANAN =====");
            order.displayOrder();

        } else if (pilih == 'n') {
            Payment payment = new Payment(total);
            payment.konfirmasiPembayaran(false);
            order.setPayment(payment);

            System.out.println("\n===== PESANAN DIBATALKAN =====");
            order.displayOrder();

        } else {
            System.out.println("\nInput tidak valid. Silakan ulangi.");
        }

        input.close();
    }
}
