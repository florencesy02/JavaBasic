package chap06;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= num) {
			sum += i;
			i++;
			
		}
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
		

	}

}
