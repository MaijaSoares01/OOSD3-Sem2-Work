package lecture08;
public class Account{
	
	private int AccountType;
	private double balance;
	private String iban;

public Account(int accountType, String iban) {
AccountType = accountType;
this.balance = 0;
this.iban = iban;
}
public int getAccountType() {
	return AccountType;
}
public void setAccountType(int accountType) {
	AccountType = accountType;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getIban() {
	return iban;
}
public void setIban(String iban) {
	this.iban = iban;
}
@Override
public String toString() {
	return "Account       AccountType = " + AccountType + ", balance = " + balance + ", iban = " + iban;
}
}

