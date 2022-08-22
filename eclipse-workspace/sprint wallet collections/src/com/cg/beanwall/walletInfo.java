package com.cg.beanwall;

public class walletInfo {
	private String walletId;
	private String Name;
	private String MobileNo;
	
	
	public String getWalletId() {
		return walletId;
	}


	


	public walletInfo(String walletId, String name, String mobileNo) {
		super();
		this.walletId = walletId;
		Name = name;
		MobileNo = mobileNo;
	}





	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getMobileNo() {
		return MobileNo;
	}


	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}


	public walletInfo() {
		
	}

}
