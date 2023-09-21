package com.java.bankaccount;

public class Main_Account 
{

	public static void main(String[] args) 
	{
		Account Ac1 = new Account(9887733923l, "Madesh");
		
		        System.out.println("Name : "+Ac1.getName());
		        System.out.println("Account No : "+Ac1.getAcc_no());
		        
		Transcation T1 = new Transcation();    //  TRANSCATION CLASS IS COMMON FOR EVERY ONE CAN ACCESS BY CREATING ACCOUNT
		            T1.deposit(5999.0, Ac1);
		            T1.withdraw(100.0, Ac1);
		            T1.checkbalance(Ac1);
		            
		            Ac1.setName("Lance");
		            T1.deposit(100, Ac1);
		            
//		Account Ac2 = new Account(6339885774l, "Keerthana");
//		        T1.withdraw(100.0, Ac2);
//		        T1.deposit(500.0, Ac2);
//		        T1.withdraw(150.0, Ac2);
//		        T1.checkbalance(Ac2);

	}

}
