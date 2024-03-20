package method;

import java.util.Scanner;

public class EvenOdd01 {
	public static void decideEvenOdd() {
		// 숫자를 입력
		System.out.println("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		// 짝수, 홀수 판단하여 출력
		if (num % 2 == 0) {
			System.out.println(">> 짝수입니다.");
		} else {
			System.out.println(">> 홀수입니다.");
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
