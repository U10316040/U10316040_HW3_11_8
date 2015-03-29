import java.util.ArrayList;
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private String name;
	ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	Account(){
			
	}
		
	Account(String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0.015;
	}
		
	//accessor methods
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
		
	public double getBalance(){
		return balance;
	}
		
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//mutator methods
	public void setId(int id){
		this.id = id;
	}
		
	public void setBalance(double balance){
		this.balance = balance;
	}
		
	public void setAnnualInterestRate(double IR){
		annualInterestRate = IR;
	}
		
	public String getDate(){
		dateCreated = new Date();
		return dateCreated.toString(); //current time
	}
		
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
		
	public double getMonthlyInterest(){
		return balance * annualInterestRate / 12;
	}
	
	public void withdraw(double money){
		balance -= money;
		transactions.add(new Transaction('W', money,balance,"\nThe date of transaction: " + getDate() + "\nType: " + 'W' + "\nThe amount of transaction: " + money + "\nYour balance after the transaction: " + balance+ "\n\n"));
	}
		
	public void deposit(double money){
		balance += money;
		transactions.add(new Transaction('W', money,balance,"\nThe date of transaction: " + getDate() + "\nType: " + 'D' + "\nThe amount of transaction: " + money + "\nYour balance after the transaction: " + balance+ "\n\n"));
	}
		
	public String toString(){
		return "Name: "+ getName() + "\nYour balance:" + getBalance() + "\nAnnual Interest rate:" + getAnnualInterestRate()*100 + "%";
	}
	

}
