/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ PiggyBankTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 19.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
 */
public class PiggyBankTest {

	public static void main(String[] args) {
		int[] money = {10000,5000,2000,1000};
		
		FamilyMember[] member = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생"),
				};
		
		FamilyMember.printMemberCnt();
		
		for (int i = 0; i < 4; i++){
			PiggyBank.putMoney(member[i], money[i]);
		}
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(member[2], 1000);
		
		PiggyBank.printBalance();
		
	}

}
