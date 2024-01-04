public class Customer {
    private String customerName;

    private String address;

    private int age;

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public Customer(String customerName, String address, int age) {
        this.customerName = customerName;
        this.address = address;
        this.age = age;
    }
}
