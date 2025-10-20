public class FlowerShop {
    private Flower[] flowers;

    public FlowerShop() {
        flowers = new Flower[] {
            new Flower("Mawar", 15000),
            new Flower("Tulip", 20000),
            new Flower("Anggrek", 25000)
        };
    }

    public void displayFlowers() {
        System.out.println("\n=== Daftar Bunga ===");
        for (int i = 0; i < flowers.length; i++) {
            System.out.println((i+1) + ". " + flowers[i].getName() + " - Rp" + flowers[i].getPrice());
        }
    }

    public Flower getFlower(int index) {
        if (index >= 0 && index < flowers.length) {
            return flowers[index];
        }
        return null;
    }
}
