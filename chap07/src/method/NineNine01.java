package method;

import java.util.Scanner;

public class NineNine01 {
   
   public static void printNineNine(int num) {
      //숫자로 주어진 부분의 구구단 출력
      System.out.println(" [구구단 " +  num + "단] ");
      for (int i = 1; i <= 9; i++) {
         System.out.println(num + " x " + i + " = " + (num * i));
      }
      System.out.println();
      
   }
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      for (int i = 2; i <= 9; i++) {
         printNineNine(i);
      }
      
   }
}
