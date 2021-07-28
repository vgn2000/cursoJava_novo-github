package entidades;

public class Account {
	
	private int accountNumber;
	private String name;
	private double deposInitial;
	private double balance;
	
	public Account(int accountNumber, String name, double deposInitial, double balance) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.deposInitial = deposInitial;
		this.balance = balance;
		
	}
	
    public Account(int accountNumber, String name, double deposInitial) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.deposInitial = deposInitial;
		
		
	}

  public Account(int accountNumber, String name) {
	
	this.accountNumber = accountNumber;
	this.name = name;

	
}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumer(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposInitial() {
		return deposInitial;
	}

	public void setDeposInitial(double deposInitial) {
		this.deposInitial = deposInitial;
	}

	public double getSaldo() {
		return balance;
	}

	
	public void depositAccount(double valor){
		this.balance = balance + valor;
	}
	
	public void deposiInitial(double valor){
		this.balance = balance + valor;
	}
	
	
	public double updateSaldo(){
		
		this.balance = + balance;
		
		return balance;
	}
	
	
	public void saqueAccount(double valor){
		double tax = 5.00;
		this.balance =  balance - valor - tax;
	}

	
	public String toString(){
		return " Account " + accountNumber
		+ " ,"
		+ "Holder: "
		+ name
		+ " , Balance: "
		+ " , $ "
		+ String.format("%.2f", updateSaldo());
		
		
	}
	
	

}
