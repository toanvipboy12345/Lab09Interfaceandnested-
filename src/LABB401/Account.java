package LABB401;

public class Account {
    protected double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Số dư ban đầu phải lớn hơn hoặc bằng 0.");
        }
    }

    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Đã gửi tiền: " + money);
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }

    public void withdraw(double money) {
        if (money > 0 && money <= balance) {
            balance -= money;
            System.out.println("Đã rút tiền: " + money);
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
