package InputOutput;

import java.util.Scanner;

public class AplusB_1000 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// Scanner ��ü�� = new Scanner(System.in)
		// System.in : �Է��� ���� Byte������ �д� ��
		// ���� ���� ���̴� ��ü���� in�� scan, sc
		
		int A = in.nextInt();
		int B = in.nextInt();
		// String �Է� ���
		// in.next() : ���ڿ� �Է½� ���� �������� ����
		// in.nextLine() :  ���ڿ� �Է½� Enter �Է� �������� ����
		// next�� ���� �߻��� ��� ��κ� �������� �� ������ �Է¹޴�
		//in.nextLine() �ַ� ��.
		// int ���� ��� ����A(����)����B�� ����, ����A(����)����B (=�� �ٷ� �Է� ����)�� ����
		// �� ���̰� ������, ������ ��� �� �� �Է½� nextLine() ��� ��
		
		System.out.println(A+B);
		
		in.close();
	}
}	
