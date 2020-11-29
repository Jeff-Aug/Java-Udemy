package entities;
public class BusinessAccount  extends Account {
	
	private double loanLimit;

	public BusinessAccount() {
		super();
	}
	public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan (double amount) {
		
		if (amount <= loanLimit) {
			balance += amount - 10;
		}	
		
	}
	@Override
	public void withdraw (double amount) {
		super.withdraw(amount);//ultiliza o metodo withdraw da class Account para complementar
		balance -=2;
	}
	
}
