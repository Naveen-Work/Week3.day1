package overriding.assignment3;

public class AxisBank extends BankInfo{

		//Method Overriding from Bankinfo class
		public void deposit() {
			System.out.println("Deposit in AxisBank Class");	
		}
		
	public static void main(String[] args) {
		
		System.out.println("************************************************");
		System.out.println("Accessing Methods using Axis Bank Class object");
		AxisBank ab=new AxisBank();
		//Deposit method in AxisBank only displayed //Because Method Overriding from Bankinfo class
		//saving and fixed methods are displayed from BankInfo class
		ab.deposit();
		ab.saving();
		ab.fixed();
		
		
		System.out.println("************************************************************************");
		System.out.println("Accessing Methods using BankInfo Class and object for Axis Bank Class");
		BankInfo bi=new AxisBank();
		//Deposit method in AxisBank only displayed //Because Method Overriding from Bankinfo class
		//saving and fixed methods are displayed from BankInfo class
		bi.deposit();
		bi.saving();
		bi.fixed();		
		
		System.out.println("************************************************");
		System.out.println("Accessing Methods using BankInfo Class object");
		BankInfo bi1=new BankInfo();
		//Deposit, saving and fixed methods are displayed from BankInfo class
		bi1.saving();
		bi1.fixed();
		bi1.deposit();
		
		
	}

}
