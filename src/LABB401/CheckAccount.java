package LABB401;

public class CheckAccount extends Account {
    private double feeTransfer;

    public CheckAccount(double initialBalance, double feeTransfer) {
        super(initialBalance);
        this.feeTransfer = feeTransfer;
    }

    @Override
    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            balance -= feeTransfer;
            System.out.println("Đã gửi tiền (sau khi trừ phí): " + money);
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }

    @Override
    public void withdraw(double money) {
        if (money > 0 && (money + feeTransfer) <= balance) {
            balance -= (money + feeTransfer);
            System.out.println("Đã rút tiền (sau khi trừ phí): " + money);
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }
}
