/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] smartPhone = new SmartPhone[]{
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		
		for (SmartPhone phone : smartPhone){
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction(phone);
			phone.turnOff();
			System.out.println();
		}
		
	}

}
