package com.cg.ServiceWall;

import com.cg.beanwall.walletInfo;
import com.cg.DAOWall.*;

public class ServicewallImpl implements Servicewall {
	WalletDao dao=new WalletDaoImpl();
    public String insertuser(walletInfo user) {
		// TODO Auto-generated method stub
	  return dao.insertuser(user);
	}


	public String deposit(int amount) {
		// TODO Auto-generated method stub
		return dao.deposit(amount);
	}


	public String withdraw(int amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(amount);
	}
	public String transaction(int amount) {
		return dao.transaction(amount);
	}


}
