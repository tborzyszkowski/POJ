package laboratorium.lab4.bank;

import java.util.*;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private List<AccountHistoryItem> history = new ArrayList<>();

	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.history = history;
	}

	public void cashIncome(double amount) {
		this.balance += amount;
		history.add(new AccountHistoryItem(OperationType.CREDIT, "CASH", accountNumber, amount));
	}

	public void cashTaking(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			history.add(new AccountHistoryItem(OperationType.CREDIT, "CASH", accountNumber, amount));
		}
		else {
			System.out.println("ERROR: cashTaking amount:" + amount +" not enough cash.");
		}
	}

	public void bankTransferToAccount(BankAccount bankAccount, double amount) {
		if(amount <= this.balance) {
			this.balance -= amount;
			this.history.add(new AccountHistoryItem(OperationType.DEBIT, 
										this.accountNumber, bankAccount.getAccountNumber(), amount));
			bankAccount.getHistory().add(new AccountHistoryItem(OperationType.CREDIT, 
										this.accountNumber, bankAccount.getAccountNumber(), amount));
		} else {
			System.out.println("ERROR: bank transfer amount:" + amount +" not enough cash.");
		}
	}
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<AccountHistoryItem> getHistory() {
		return history;
	}

	public void setHistory(List<AccountHistoryItem> history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "BankAccount [\n\taccountNumber=" + accountNumber + "\n\tbalance=" + balance + ",\n\thistory=" + history
				+ "]";
	}

}
