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
	 * ����ڰ� �ΰ��� ���� �����ȣ�� �Է¹޾� ������ ����� ���ÿ�.(����,if�����)
	 * ����s��  ���ڷ� �ٲ��ִ� �޼���� Integer.parseInt(s)
	 * equals�޼��� ���(A�� B���ڰ� ���� �������� �˾ƺ��� A.equals(B) ���·� ��� ����� true,false�� ������
	 * 
	 */
//	�������
//	ù��° ���� �Է��ϼ���.4
//	�ι�° ���� �Է��ϼ���.3
//	�����ȣ�� �Է��Ͻÿ�(+,-,*,/). *
//	���� : 4*3 = 12
//	
//	
//	���� �����ȣ�� �ƴϸ� �Ʒ��� ���� ������¸� ��Ÿ����.
//	�����ȣ�� �˼� �����ϴ�.
	
	
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
