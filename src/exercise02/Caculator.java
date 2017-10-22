/**
 * 
 */
package exercise02;

import java.util.Scanner;

/**
 * @since 2017. 10. 22.
 * @author 구병국
 */
public class Caculator {

	/**
	 * @param args
	 * 사용자가 두개의 값을 입력하면 두수를 이용하여 사칙연산을 만들어 보시오.(변수사용)
	 */
//	출력형태
//	첫번째 수를 입력하세요.4
//	두번째 수를 입력하세요.3
//	덧셈 : 4+3 = 7
//	뺄샘 : 4-3 = 1
//	곱셈 : 4*3 = 12
//	나눗셈 : 4/3 = 1
	
	public static void main(String[] args) {

		getUserInput();

	}

	/**
	 * 
	 */
	private static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
		
	}

}
