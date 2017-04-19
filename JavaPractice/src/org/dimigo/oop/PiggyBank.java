/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ PiggyBank
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 19.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
 */
public class PiggyBank {
	private static int balance;
	
	static void  putMoney(FamilyMember member, int amount){
		balance += amount;
		System.out.println(String.format("%s : %d원 넣음",member.getMemberName(),amount ));
	}
	
	static void printBalance(){
		System.out.println("돼지저금통 총 금액 : "+balance+"원");
	}
}
