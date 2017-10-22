/**
 * 
 */
package exercise04;

import java.util.Scanner;

/**
 * @since 2017. 10. 22.
 * @author 구병국
 *
 * 여러개의 숫자와 연산 기호를 입력 받아서 계산을 하는 프로그램을 만드시오.(반복문)
 */
public class Calculator {

	/**
	 * While 반복문 중에서 while(true) 를 사용하시오.
	 * quit를 입력하면 프로그램을 종료하시오.
	 * 연산기호를 잘못입력하면 올바른 연산기호를 입력 받을 때까지 다시 연산기호를 입력받도록 하시오.
	 * 문자s를 숫자로 바꿀 경우 Integer.parseInt(s)의 형식으로 사용하시오.
	 * equals메서드 사용(A와 B글자가 같은 내용인지 알아볼때 A.equals(B) 형태로 사용 결과는 true,false로 전달
	 */

//	출력형태
//	첫번째 값을 입력하시오. 5
//	연산기호를 입력하시오. *
//	두번째 값을 입력하시오. 4
//	곱셈 : 5 * 4 = 20
//	연산기호를 입력하시오. k
//	연산기호를 입력하시오. /
//	두번째 값을 입력하시오. 2
//	나눗셈 : 20 / 2 = 10
//	연산기호를 입력하시오. quit
//	계산기 끝~ 안녕!

	public static void main(String[] args) {

		getUserInput();

	}

	
	private static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		return input;
	}
}