/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 * 	 |_ ArakoMenu
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 15.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
 */
public class ArakoMenu {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
			 BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))) 
		{
			String data;
			while ( (data = br.readLine()) != null ) {
				writer.write(data);
				((BufferedWriter)writer).newLine();
			}
			writer.flush();			// flush를 통해 버퍼에 남아있는 데이터를 파일에 최종적으로 기록함
			System.out.println("<< 메뉴 출력 >>");
			while ( (data = reader.readLine()) != null ) {
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
