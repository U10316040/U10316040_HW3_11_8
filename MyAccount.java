public class MyAccount {

	public static void main(String[] args) {
		Account b = new Account("Geore", 1222, 1000);
		System.out.println(b.toString()); //print initial situation
		b.deposit(30);
		b.deposit(40);
		b.deposit(50);
		b.withdraw(5);
		b.withdraw(4);
		b.withdraw(2);
		
		//print all transactions
		for(int i=0; i<6; i++){
			System.out.print(b.transactions.get(i).getDescription());
			try{Thread.sleep(1400);}catch(Exception e){} //stop 14s
		}
	}

}
