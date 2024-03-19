package select;

import java.util.Scanner;

public class StringConv {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("세 개의 숫자를 입력하세요 : ");
		
		int a = Integer.parseInt(input.next());
		//String tempA = input.next();
		//int a = Integer.parseInt(tempA);
		
		int b = Integer.parseInt(input.next());
		int c = Integer.parseInt(input.next());
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
