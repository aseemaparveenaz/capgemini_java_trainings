package com.cg.walletbean;

public class walletuser {
	public walletuser(String walletId, String userName, String userAccessCode) {
		super();
		this.walletId = walletId;
		this.userName = userName;
		this.userAccessCode = userAccessCode;
		
	}
	private String walletId;
	private String userName;
	private String userAccessCode;
	
	public String getWalletId() {
		return walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAccessCode() {
		return userAccessCode;
	}
	public void setUserAccessCode(String userAccessCode) {
		this.userAccessCode = userAccessCode;
	}
	
	public walletuser() {
		
	}
}
