class MessWallet {
    private double balance;

    MessWallet(double b) {
        if (b < 0) {
            balance = 0;
            System.out.println("Invalid balance");
        } else
            balance = b;
    }

    void topUp(double x) {
        if (x > 0)
            balance += x;
    }

    void deduct(double x) {
        if (x <= balance)
            balance -= x;
        else
            System.out.println("Insufficient balance");
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        MessWallet w = new MessWallet(500);
        w.topUp(200);
        w.deduct(1000);
        System.out.println(w.getBalance());
    }
}