/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 * 	 |_ Loop
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 15.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int Attack = 100;
		Scanner s = new Scanner(System.in);
		int Choice;
		Random Rand = new Random();
		String[] Char = {"마법사", "영주", "기사", "농민"};
		
		do {
			System.out.println("------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력  감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("------------");
			System.out.print("메뉴 입력 =>");
			
			Choice = s.nextInt();
			
			switch (Choice){
			case 1:
				Attack+=10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+Attack);
				break;
			case 2:
				Attack-=10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+Attack);
				break;
			case 3:
				System.out.println(Char[Rand.nextInt(4)]+"(으)로 설정되었습니다.");
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			} 
		} while(Choice != 9);
		s.close();
	}

}
