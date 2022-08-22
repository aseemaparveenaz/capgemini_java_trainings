package com.cg.walletjunit;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;



import org.junit.Test;
import com.cg.walletbean.*;
import com.cg.walletDAO.*;
public class WalletJunitTestCase {



@Test
public void test() {
//fail("Not yet implemented");
walletuser a = new walletuser("2345","aseema","9840778344");
assertEquals("2345",a.getWalletId());
assertEquals("aseema",a.getUserName());
assertEquals("9840778344",a.getUserAccessCode());
}
@Test
public void getdeposit() {
walletDAO b = new walletDAOImpl();
b.deposit(500);
}

@Test
public void getwithdraw() {
walletDAO b1 = new walletDAOImpl();
b1.withdraw(200);
}
@Test
public void getTransaction() {
walletDAO b2 = new walletDAOImpl();
b2.transaction(100);
}



}