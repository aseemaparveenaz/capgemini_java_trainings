package com.cg.ServiceWall;

import com.cg.beanwall.walletInfo;

public interface Servicewall {
	public String insertuser (walletInfo user);
	public String deposit(int amount);
	public String withdraw(int amount);
	public String transaction(int amount);


}
