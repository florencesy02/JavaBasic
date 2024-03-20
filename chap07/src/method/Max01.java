package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max01 {
	
	public static int getMax(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inStr = br.readLine();
		
		StringTokenizer st = new StringTokenizer(inStr, ",");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		
		System.out.println(getMax(a, b, c));
	}
}
