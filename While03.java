package chap06;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		
		int bContinue = 1;
		
		while (bContinue == 1) {	//1이면 계속, 0이면 멈춤
			//숫자를 입력
			System.out.print("숫자를 입력하세요 : ");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
		
		//짝수, 홀수 판단하여 출력
			if (num % 2 == 0) {
				System.out.println(">> 짝수입니다.");
			}
			else {
				System.out.println(">> 홀수입니다.");
			}
		
		//계속할 것인지 확인
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			bContinue = input.nextInt();
		}
		System.out.println("끝났습니다!");
	}
}
