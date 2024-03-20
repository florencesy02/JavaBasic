package method;

import java.util.Scanner;

public class Sum01 {

	public static int getNumberKeyboard(String message) {
		System.out.print(message);
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static void printScreen(int value) {
		System.out.println(value);
	}
	
	public static void printScreen(int value, String message) {
		System.out.println(message + " " + value);
	}

	public static int getSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// 1. 입력 받기
		int num;

		// 2. 숫자가 양수이면 진행
		while ((num = getNumberKeyboard("양의 숫자를 입력하세요 : ")) > 0) { // 4. 1번 반복

			// 3. 1부터 숫자까지 더해서 출력
			int result = getSum(num);

			// 4. 더한 값을 출력
			// printScreen(result);
			printScreen(result, "합계 : ");
		}
		System.out.println("다음에 또 봅시다!");

	}
}