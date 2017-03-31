/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {
		String[] questions = {"가수","배우","과목"};
		String[] answers  = {"엠씨더맥스","강동원","응용 프로그래밍"};
//		String respond;
		StringBuilder sb = new StringBuilder();
		Scanner s = new Scanner(System.in);
		
		
		for (int i = 0; i < 3; i++){
			System.out.println(i+1+". 가장 좋아하는 "+questions[i]+"는?");
			String respond=s.nextLine();
			
			if (respond.equals(answers[i])){
				System.out.println("정답입니다!");
			} else {
				System.out.println("틀렸습니다!");
			}
		}
		System.out.println("<<결과 출력>>");
		for (int i = 0; i<3; i++){
			sb.append("가장 좋아하는 ").append(questions[i]).append((i<2)?"는? ":"은? ").append(answers[i]).append("입니다.\n");
		}
		System.out.println(sb);
		s.close();
	}

}
