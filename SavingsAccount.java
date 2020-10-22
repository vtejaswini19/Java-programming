
public class SavingsAccount {
	static double annualInterestRate=0.0;
	private double savingsBalance;
	public SavingsAccount() {}
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance=savingsBalance;
	}
	public double calculateMonthlyInterest() {
		double monthlyInterest=(savingsBalance+annualInterestRate)/12;
		savingsBalance+=monthlyInterest;
		return savingsBalance;
		
	}
	public static void modifyInterestRate(double interestRate) {
		annualInterestRate=interestRate;
	}
	public static void main(String[] args) {
		SavingsAccount saver1=new SavingsAccount(2000.00);
		SavingsAccount saver2=new SavingsAccount(3000.00);
		saver1.modifyInterestRate(0.04);
		System.out.println("Balance of saver1:"+saver1.calculateMonthlyInterest());
		System.out.println("Balance of saver2:"+saver2.calculateMonthlyInterest());
		saver2.modifyInterestRate(0.05);
		System.out.println("Balance of saver1:"+saver1.calculateMonthlyInterest());
		System.out.println("Balance of saver2:"+saver2.calculateMonthlyInterest());
	}

}
