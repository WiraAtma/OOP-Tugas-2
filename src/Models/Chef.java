package Models;

public class Chef extends Thread {
    private OrderTable table;

    public Chef(OrderTable table) {
        this.table = table;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Chef: Memasak pesanan " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
        System.out.println("Chef selesai memasak.\n");
    }
}
