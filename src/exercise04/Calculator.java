/**
 * 
 */
package exercise04;

import java.util.Scanner;

/**
 * @since 2017. 10. 22.
 * @author ������
 *
 * �������� ���ڿ� ���� ��ȣ�� �Է� �޾Ƽ� ����� �ϴ� ���α׷��� ����ÿ�.(�ݺ���)
 */
public class Calculator {

	/**
	 * While �ݺ��� �߿��� while(true) �� ����Ͻÿ�.
	 * quit�� �Է��ϸ� ���α׷��� �����Ͻÿ�.
	 * ����s�� ���ڷ� �ٲ� ��� Integer.parseInt(s)�� �������� ����Ͻÿ�.
	 * equals�޼��� ���(A�� B���ڰ� ���� �������� �˾ƺ��� A.equals(B) ���·� ��� ����� true,false�� ����
	 */
//	�������
//	ù��° ���� �Է��Ͻÿ�. 5
//	�����ȣ�� �Է��Ͻÿ�. *
//	�ι�° ���� �Է��Ͻÿ�. 4
//	���� : 5 * 4 = 20
//	�����ȣ�� �Է��Ͻÿ�. /
//	�ι�° ���� �Է��Ͻÿ�. 2
//	������ : 20 / 2 = 10
//	�����ȣ�� �Է��Ͻÿ�. quit
//	���� ��~ �ȳ�!

	public static void main(String[] args) {
		
		getUserInput();
	}
	
	private static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		return input;
		
	}


}
