/**
 * 
 */
package exercise02;

import java.util.Scanner;

/**
 * @since 2017. 10. 22.
 * @author ������
 */
public class Caculator {

	/**
	 * @param args
	 * ����ڰ� �ΰ��� ���� �Է��ϸ� �μ��� �̿��Ͽ� ��Ģ������ ����� ���ÿ�.(�������)
	 */
//	�������
//	ù��° ���� �Է��ϼ���.4
//	�ι�° ���� �Է��ϼ���.3
//	���� : 4+3 = 7
//	���� : 4-3 = 1
//	���� : 4*3 = 12
//	������ : 4/3 = 1
	
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
