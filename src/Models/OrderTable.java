package Models;

public class OrderTable {
    private int orderNumber = 1;

    public synchronized void takeOrder(String name) {
        System.out.println(name + " mengambil pesanan #" + orderNumber);
        orderNumber++;
    }
}
