package com.czeczotka.bdd.banking;

public class Banking {

	private int balance;
	
	private int result;
	
    public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void substract(int arg1) {
		if(balance > arg1)
		{
			balance = balance - arg1;
			result = arg1;
		}
		else
		{
			result = 0;
		}
    }
}
