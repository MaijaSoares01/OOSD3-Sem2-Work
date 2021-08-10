package lecture08;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
public class Bank {
	private static int uniqueIdentifier = 10001;
	private int depositType = 101;
	private int currentType = 102;
	private static String ibanStart = "IEAIB";
	private static int acccountNumber = 1000001;
	private static int sortCode = 900102;
	
	private Map<Integer, Customer> customerCollection;
	public Bank() {
		this.customerCollection = new Hashtable();
	}
	public Customer CreateCustomer(String firstName, String lastName, String address, String phoneNumber) {
		Bank.uniqueIdentifier++;
		int customerID = Bank.uniqueIdentifier;
		Customer myCustomer = new Customer(firstName, lastName, address, phoneNumber, customerID);
		customerCollection.put(customerID, myCustomer);
		return myCustomer;
	}
	public void CreateAccount(int custID, int accountType) {
		Customer customer = customerCollection.get(custID);
		Bank.acccountNumber++;
		String accountNumber = Bank.ibanStart + Bank.acccountNumber + Bank.sortCode;
		Account acc = new Account(currentType, accountNumber);
		customer.getCustomerAccount().add(acc);
	}
	
	public Customer findCustomer(int customerID) {
		return customerCollection.get(customerID);
	}
	
	public void deposit(Customer customer, double amount, String iban) {
		ArrayList<Account> custAccounts = (ArrayList<Account>) customer.getCustomerAccount();
		for (Account acc : custAccounts) {
			if (acc.getIban().equals(iban)) {
				acc.setBalance(acc.getBalance() + amount);
			}
		}
	}
	public void withdraw(Customer customer, double amount, String iban) {
		ArrayList<Account> custAccounts = (ArrayList<Account>) customer.getCustomerAccount();
		for (Account acc : custAccounts) {
			if (acc.getIban().equals(iban)) {
				if (acc.getBalance() >= amount)
				acc.setBalance(acc.getBalance() - amount);
			}
		}
	}
	public static void main(String[] args) {
}
}