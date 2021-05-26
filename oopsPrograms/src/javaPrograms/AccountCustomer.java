package javaPrograms;

class AccountCutomer {
	String firstName;
	String lastName;

	public AccountCutomer() {

		super();
		System.out.println("default");
	}

	public AccountCutomer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

}

class Account extends AccountCutomer {

	String customerType;
	double balance;
	int accountNo;
	float interestRate;

	public Account() {
		super();
	}

	public Account(String firstName, String lastName, String customerType, double balance, int accountNo,
			float interestRate) {
		super(firstName, lastName);
		this.customerType = customerType;
		this.balance = balance;
		this.accountNo = accountNo;
		this.interestRate = interestRate;
	}

	public void deposit(double amount) {

		amount = amount + balance;
		System.out.println(amount);
	}

	public void withdraw(double amount) {
		if (amount < balance) {
			amount = balance - amount;
			System.out.println("withdarw amount is" + amount);
		} else
			System.out.println("Insufficient Balance");

	}

	public void display() {
		System.out.println("Account [customerType=" + customerType + ", balance=" + balance + ", accountNo=" + accountNo
				+ ", interestRate=" + interestRate + ", firstName=" + firstName + ", lastName=" + lastName + "]");
	}

}

public class AccountCustomer {

	public static void main(String[] args) {

		// AccountCutomer c=new AccountCutomer("Anusha","syamakuri");

		Account a = new Account("anusha", "syamakuri", "women", 30000.0, 98637, 2);
		a.display();
		a.withdraw(40000.00);

	}

}
