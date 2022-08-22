package com.cg.DAOWall;

import com.cg.beanwall.walletInfo;

public interface WalletDao {
	public String insertuser (walletInfo user);
	public String deposit(int amount);
	public String withdraw(int amount);
	public String transaction(int amount);


}
