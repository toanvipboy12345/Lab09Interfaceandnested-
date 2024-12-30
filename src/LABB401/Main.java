package LABB401;

public class Main {
    public static void main(String[] args) {
        // Tạo tài khoản thường
        Account account = new Account(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Số dư tài khoản thường: " + account.getBalance());

        // Tạo tài khoản tiết kiệm
        SavingAccount savingAccount = new SavingAccount(1000, 0.05);
        savingAccount.getInterest();

        // Tạo tài khoản vãng lai
        CheckAccount checkAccount = new CheckAccount(1000, 10);
        checkAccount.deposit(500);
        checkAccount.withdraw(200);
        System.out.println("Số dư tài khoản vãng lai: " + checkAccount.getBalance());
    }
}
