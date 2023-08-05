package org.bank;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		// super.deposit();
		System.out.println("Axis Bank Deposit");
	}

}
