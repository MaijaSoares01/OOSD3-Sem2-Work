package lecture08;
import java.util.ArrayList;
import java.util.List;
public class Customer {
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private List<Account> customerAccounts;
	private int customerID;
	
	public Customer(String firstName, String lastName, String address, String phoneNumber, int customerID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.customerID = customerID;
		customerAccounts = new ArrayList<Account>();
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<Account> getCustomerAccount(){
		return customerAccounts;
	}
	public void setCustomerAccounts(List<Account> customerAccounts) {
		this.customerAccounts = customerAccounts;
	} 
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phoneNo="
				+ phoneNumber + ", customerAccounts=" + customerAccounts + ", customerID=" + customerID + "]";
	}
}
