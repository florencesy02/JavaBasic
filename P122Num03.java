package BOJBook;

import java.util.Scanner;

public class P122Num03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int sum = 0;
        
        int num = 0;

        do {
            System.out.print("양의 정수를 입력하세요 : ");
			num = input.nextInt();

            if (num % 2 == 0) {
                sum += num;
            }
        } while (num > 0);

        System.out.println("입력된 양의 정수 중에서 짝수의 합은 " + sum);

    }
}
