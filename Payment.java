public class Payment {
    private double totalBayar;
    private String status;

    public Payment(double totalBayar) {
        this.totalBayar = totalBayar;
        this.status = "BELUM BAYAR";
    }

    public void konfirmasiPembayaran(boolean bayar) {
        if (bayar) {
            status = "LUNAS";
            System.out.println("Pembayaran berhasil! Status: " + status);
        } else {
            status = "DIBATALKAN";
            System.out.println("Pembayaran dibatalkan.");
        }
    }

    public String getStatus() {
        return status;
    }

    public double getTotalBayar() {
        return totalBayar;
    }
}
