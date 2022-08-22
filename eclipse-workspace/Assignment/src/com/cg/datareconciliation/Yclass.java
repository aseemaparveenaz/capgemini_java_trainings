package com.cg.datareconciliation;

import java.sql.Date;

public class Yclass {
	 private String AccountId;
     private String PostingDate;
     private double amount;
	public Yclass(String accountId, String postingDate, double amount) {
		super();
		AccountId = accountId;
		PostingDate = postingDate;
		this.amount = amount;
	}
	public String getAccountId() {
		return AccountId;
	}
	public void setAccountId(String accountId) {
		AccountId = accountId;
	}
	
	public string getPostingDate() {
		return PostingDate;
	}
	public void setPostingDate(String postingDate) {
		PostingDate = postingDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
     

}
