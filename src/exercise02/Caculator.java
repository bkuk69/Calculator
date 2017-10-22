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
	 * 사용자가 두개의 값과 연산기호를 입력받아 연산을 만들어 보시오.(변수,if문사용)
	 * 문자s를  숫자로 바꿔주는 메서드는 Integer.parseInt(s)
	 * equals메서드 사용(A와 B글자가 같은 내용인지 알아볼때 A.equals(B) 형태로 사용 결과는 true,false로 전달함
	 * 
	 */
//	출력형태
//	첫번째 수를 입력하세요.4
//	두번째 수를 입력하세요.3
//	연산기호를 입력하시오(+,-,*,/). *
//	곱셈 : 4*3 = 12
//	
//	
//	만일 연산기호가 아니면 아래와 같은 출력형태를 나타낸다.
//	연산기호를 알수 없습니다.
	
	
	public static void main(String[] args) {

		getUserInput();

	}

	/**
	 * 
	 */
	private static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		return input;
		
	}

}
