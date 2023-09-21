package com.java.bankaccount;

public class Account 
{
	// DATA MEMBERS DECLEARED AS PRIVATE WHILE USING JAVA-BEANS CLAUSE
	private long Acc_no;
	private String Name;
	private double Balance;
	
	// DEVELOPE A CONSRUCTORS TO INITIALIZE THE DATA
	public Account(long Acc_no,String Name)
	{
		this.Acc_no = Acc_no;
		this.Name   = Name;
	}
	
	/* CREATE A GETTER METHOD TO READ THE DATA USING JAVA-BEANS CLAUSE */
	public long getAcc_no()
	{
		return Acc_no;
	}
	public String getName()
	{
		return Name;
	}
	public double getBalance()
	{
		return Balance;
	}
	
	/* CREATE A SETTER METHOD TO UPDATE OR WRITE THE DATA USING JAVA-BEANS CLAUSE */
	public void setAcc_no(long U_Acc_no ) 
	{
		this.Acc_no = U_Acc_no;
	}
	public void setName(String U_Name ) 
	{
		this.Name = U_Name;
	}
	public void setBalance(double U_Balance) 
	{
		this.Balance = U_Balance;
	}

}
