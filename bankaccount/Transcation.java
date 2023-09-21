package com.java.bankaccount;

public class Transcation 
{

	public void deposit(double Amt,Account a) 
	{
		if(Amt>=0)
		{
			double B = a.getBalance()+Amt;
		               a.setBalance(B);	
			           System.out.println("Amount Deposited By '"+a.getName()+"' is Rs/- "+ Amt);
		}else
		{
			System.out.println("Invalid Amount");
		}
	}
	public void withdraw(double Amt,Account a) 
	{
		if(a.getBalance()>=Amt && Amt>=0)
		{
			double B = a.getBalance()-Amt;
			           a.setBalance(B);
			       System.out.println("Amount Withdraw By '"+a.getName()+"' is Rs/- "+ Amt);
			
		}else
		{
			System.out.println("Insufficient Amount For "+a.getName());
		}
	}
	public void checkbalance(Account a) 
	{
		System.out.println("Current Balance Of '"+a.getName()+"' is Rs/- "+a.getBalance());
	}
}

