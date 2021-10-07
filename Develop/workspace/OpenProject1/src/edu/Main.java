/**
 * 
 */
package edu;

import java.util.Scanner;

/**
 * @author jeong-ganim
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		int firstno, secondno;
		int sum;
		
		//두수 입력 : 라이브러리 사용해 입력하고싶
		Scanner scan = new Scanner(System.in);
		System.out.print("첫수 : ");
		firstno= scan.nextInt();
		System.out.print("두번째 수 : ");
		secondno = scan.nextInt();
		
		//합계내
		sum = firstno + secondno;
		
		//합계출력
		System.out.println("합계: "+ sum);
		System.out.println("추가");

	}

}
