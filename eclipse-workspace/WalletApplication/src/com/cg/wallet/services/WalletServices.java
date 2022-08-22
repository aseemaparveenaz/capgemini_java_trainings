package com.cg.wallet.services;

import com.wallet.exceptions.AccBalanceNotSufficientException;

public interface WalletServices {
	void withdraw(int amount2);
	void deposit(int amount);
	void trans(int amount3);
	void showMenu();
}
