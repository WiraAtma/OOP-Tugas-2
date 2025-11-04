package Models;

public class Cashier extends Thread {
    private int totalRevenue = 0;

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Kasir: Menghitung pembayaran pesanan " + i);
            totalRevenue += 50000;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        System.out.println("Kasir selesai menghitung.");
        System.out.println("Total pendapatan: Rp " + totalRevenue + "\n");
    }
}
