package umlDiagrams;


public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	private char type;
	private double amount;
	private String describe;
	
	public Account(){
		dateCreated = new java.util.Date();
	}
	
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new java.util.Date();
	}
	
	public boolean withdraw(double amount) {
		if(balance > amount) {
			balance -= amount;
		transaction('W', amount, "withdrawn " + amount);
			return true;
		}
		return false;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
		transaction('D', amount, "deposited " + amount);
	}
	
	public void transaction(char type, double amount, String describe) {
		this.type = type;
		this.amount = amount;
		this.describe = describe;
	}

	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public String getTransaction() {
		return "\nYou have " + describe;
	}
	
	public String result() {
		return getDateCreated().toLocaleString() + "\n--------------------------" + "\nAccount id : " + getId() 
				+ getTransaction() + "\nThe balance on account : " + getBalance() +"\n";
				//+ "\nAnnual interest is : " + getAnnualInterestRate();
	}
	
}
