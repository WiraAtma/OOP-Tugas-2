package Models;

public class Waiter extends Thread {
    private OrderTable table;
    private String name;

    public Waiter(String name, OrderTable table) {
        this.name = name;
        this.table = table;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            table.takeOrder(name);
            System.out.println(name + ": Mengantarkan pesanan");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {}
        }
        System.out.println(name + " selesai mengantarkan.\n");
    }
}
