package LABB401;

public class SavingAccount extends Account {
    private double rate;

    public SavingAccount(double initialBalance, double rate) {
        super(initialBalance);
        this.rate = rate;
    }

    public double getInterest() {
        double interest = balance * rate;
        System.out.println("Tiền lãi: " + interest);
        return interest;
    }
}
