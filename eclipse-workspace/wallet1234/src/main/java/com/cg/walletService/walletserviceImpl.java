package com.cg.walletService;

import com.cg.walletDAO.*;
import com.cg.walletbean.walletuser;

public class walletserviceImpl implements walletservice{
	walletDAO dao=new walletDAOImpl();
    public String insertuser(walletuser user) {
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
