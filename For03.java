package chap06;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {

		System.out.print("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println("[ 구구단 " + num + "단 ]");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

	}

}
