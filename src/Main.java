import Models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("SIMULASI RESTORAN\n");

        OrderTable table = new OrderTable();

        Chef chef = new Chef(table);
        Waiter waiter1 = new Waiter("Pelayan A", table);
        Waiter waiter2 = new Waiter("Pelayan B", table);
        Cashier cashier = new Cashier();

        chef.start();
        waiter1.start();
        waiter2.start();
        cashier.start();

        try {
            chef.join();
            waiter1.join();
            waiter2.join();
            cashier.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("RESTORAN TUTUP");
    }
}