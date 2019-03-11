package SharedModel;

import java.io.Serializable;

public class Account implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int number;
    private double balance;


    public Account(int number, double balance) {

        this.number = number;
        this.balance = balance;
    }


    public int getNumber() {
        return number;
    }


    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {

        balance += amount;
    }


}
