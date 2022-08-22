package com.cg.walletDAO;

import com.cg.walletbean.walletuser;

public interface walletDAO {
	public String insertuser (walletuser user);
	public String deposit(int amount);
	public String withdraw(int amount);
	public String transaction(int amount);

}
