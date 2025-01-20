package com;

class BankImp1 implements Bank{
	
	@Override
	public void deposit(int amt) {
		System.out.println("You deposit "+amt);
	}
	@Override
	public void withdraw(int amt) {
		System.out.println("You Withdraw "+amt);
	}
	@Override
	public void checkBalance(){
		
		System.out.println("Your available balance is ");		
	}

}
