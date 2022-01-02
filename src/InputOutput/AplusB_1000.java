package InputOutput;

import java.util.Scanner;

public class AplusB_1000 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// Scanner 객체명 = new Scanner(System.in)
		// System.in : 입력한 값을 Byte단위로 읽는 것
		// 가장 많이 쓰이는 객체명은 in과 scan, sc
		
		int A = in.nextInt();
		int B = in.nextInt();
		// String 입력 방법
		// in.next() : 문자열 입력시 공백 전까지만 받음
		// in.nextLine() :  문자열 입력시 Enter 입력 전까지만 받음
		// next는 에러 발생이 잦아 대부분 문제에서 행 단위로 입력받는
		//in.nextLine() 주로 씀.
		// int 같은 경우 숫자A(공백)숫자B로 쓰든, 숫자A(엔터)숫자B (=두 줄로 입력 받음)로 쓰든
		// 별 차이가 없지만, 문자의 경우 두 줄 입력시 nextLine() 써야 함
		
		System.out.println(A+B);
		
		in.close();
	}
}	
