package Scanner;

import java.util.Scanner;

public class example01 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = input.nextLine();
		System.out.println("당신의 이름 : " + name);
	}

}
