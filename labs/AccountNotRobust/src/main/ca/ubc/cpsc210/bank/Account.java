package ca.ubc.cpsc210.bank;

import ca.ubc.cpsc210.bank.exceptions.AmountException;
import ca.ubc.cpsc210.bank.exceptions.InsufficientFundsException;
import ca.ubc.cpsc210.bank.exceptions.MoneyLaundering;
import ca.ubc.cpsc210.bank.exceptions.NegativeAmountException;
import com.sun.org.apache.xpath.internal.operations.Neg;

public class Account {
	
	private static int nextAccountId = 1;  // tracks id of next account created
	private int id;                        // account id
	private String name;                   // the account owner name
	private double balance;                // the current balance of the account

	/*
	 * Constructor: initializes an account
	 * 
	 * REQUIRES: accountName has a non-zero length
	 * EFFECTS: name on account is set to accountName; account id is a
	 *          positive integer not assigned to any other account;
	 *          if initialBalance >= 0 then balance on account is set to
	 *          initialBalance, otherwise balance is zero.
	 */
	public Account(String accountName, double initialBalance) {
		id = nextAccountId++;
		name = accountName;
		if (initialBalance >= 0)
			balance = initialBalance;
		else
			balance = 0;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	/*
	 * Deposit money into the account
	 * 
	 * REQUIRES: amount >= 0
	 * MODIFIES: this
	 * EFFECTS: amount is added to balance and updated
	 * 			balance is returned
	 */
	public double deposit(double amount) throws NegativeAmountException, MoneyLaundering {
	    if (amount < 0)
	        throw new NegativeAmountException();
		balance = balance + amount;
		if (amount > 10000.0)
		    throw new MoneyLaundering();
		return balance;
	}

	/*
	 * Withdraw money from the account
	 *
	 * REQUIRES: amount >= 0 and amount <= getBalance()
	 * MODIFIES: this
	 * EFFECTS: amount is withdrawn from account and updated 
	 * 		    balance is returned
	 */
	public double withdraw(double amount) throws NegativeAmountException, InsufficientFundsException {
        if (amount < 0)
            throw new NegativeAmountException();
        if (balance < amount)
            throw new InsufficientFundsException();
		balance = balance - amount;
		return balance;
	}

	public void transferFrom(Account toAccount, double amount) throws NegativeAmountException, InsufficientFundsException {
        double beforeNetBalance = getBalance() + toAccount.getBalance();
	    try {
            withdraw(amount);
            toAccount.deposit(amount);
        } catch (Exception e) {
            assert (beforeNetBalance == getBalance() + toAccount.getBalance());
            throw e;
        }
        assert (beforeNetBalance == getBalance() + toAccount.getBalance());
    }

	/*
	 * Returns the string representation of an account
	 * 
	 * EFFECTS: returns a string representation of account
	 */
	@Override
	public String toString() {
		return "[ id = " + id + ",    name = " + name + ",     " +
				"balance = " + balance + "]";
	}
}
