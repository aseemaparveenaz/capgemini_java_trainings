package com.cg.datareconciliation;

import java.sql.Date;

public class Xclass {
     private String AccountId;
     private String PostingDate;
     private double amount;
	public Xclass(String accountId, String postingDate, double amount) {
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

	public String getPostingDate() {
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
