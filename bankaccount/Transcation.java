package com.java.bankaccount;

//  TRANSCATION CLASS IS COMMON FOR EVERY ONE CAN ACCESS LIKE ' ATM MEACHINE ' 
public class Transcation 
{
	
	// DEVELOP A DEPOSIT METHOD 'OR' FUNCTION
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
	
	// DEVELOP A WITHDRAW METHOD 'OR' FUNCTION
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
	
	// DEVELOP A CHECKBALANCE METHOD 'OR' FUNCTION
	public void checkbalance(Account a) 
	{
		System.out.println("Current Balance Of '"+a.getName()+"' is Rs/- "+a.getBalance());
	}
}

