public class Transaction extends Account {
	//Because Transaction extends Account, Transaction also have getDate(),getBalance() and setBalance(double balance). 
	private char type;                    
	private double amount;
	private String description;
	Transaction(){

	}
	Transaction(char type, double amount, double balance, String description){
		this.type = type;
		this.amount = amount;
		setBalance(balance);
		this.description = description;
	}
	//accessor methods
	public char getType(){
		return type;
	}
	public double getAmount(){
		return amount;
	}
	public String getDescription(){
		return description;
	}
	//mutator methods
	public void setAmount(double amount){
		this.amount = amount; 
	}
	public void setType(char type){
		this.type = type; 
	}
	public void setDescription(String des){
		description = des;
	}
	
}
