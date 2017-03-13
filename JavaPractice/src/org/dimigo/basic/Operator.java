/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	 |_ Operator
 *
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 변수 선언
		int Pay = 1700000, Employee = 3, Store = 1500;
		long Total = Pay * 12L * Employee * Store;
		
		//출력
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 :"+String.format("%,d",Pay)+"원");
		System.out.println("점포 내 직원 수 :"+Employee+"명");
		System.out.println("점포 수 :"+String.format("%,d",Store)+"개");
		System.out.println();
		System.out.println("연간 인건비 :"+String.format("%,d",Total)+"원");
	}

}
