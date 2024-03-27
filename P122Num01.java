package BOJBook;

import java.util.Scanner;

public class P122Num01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if (num >= 19) {
			System.out.println("성년");
		}
		else if (num < 19) {
			System.out.println("미성년");
		}
	}

}
