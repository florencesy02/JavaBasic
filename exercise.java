package algorithm;
import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("숫자를 입력하세요. 0을 입력하면 종료됩니다.");
        
        while (true) {
            int num = scanner.nextInt();
            
            if (num == 0) {
                break;
            }
            
            sum += num;
        }
        
        System.out.println("지금까지 더한 값: " + sum);
    }
}