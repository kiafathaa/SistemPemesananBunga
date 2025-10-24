import java.util.ArrayList;

public class FlowerShop {
    private ArrayList<Flower> flowers;

    public FlowerShop() {
        flowers = new ArrayList<>();
        flowers.add(new Flower("Mawar", 25000));
        flowers.add(new Flower("Tulip", 30000));
        flowers.add(new Flower("Lily", 28000));
    }

    public void displayFlowers() {
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println((i + 1) + ". " + flowers.get(i));
        }
    }

    public Flower getFlower(int index) {
        if (index >= 0 && index < flowers.size()) {
            return flowers.get(index);
        } else {
            System.out.println("Pilihan tidak valid!");
            return null;
        }
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }
}
