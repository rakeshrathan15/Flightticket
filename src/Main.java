public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("rakesh","suryapet",24);
        Ticket ticket = new Ticket();
        System.out.println(ticket.booking(customer));
        System.out.println(customer);
    }
}