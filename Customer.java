public class Customer {
    private String name;
    private String phone;
    private String address;

    public Customer(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    public void displayCustomerInfo() {
        System.out.println("Nama Pelanggan: " + name);
        System.out.println("No. Telepon   : " + phone);
        System.out.println("Alamat        : " + address);
    }
}
