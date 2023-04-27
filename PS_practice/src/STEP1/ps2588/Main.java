package ps2588;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		String b = sc.next();
		
		
		System.out.println(a * (b.charAt(2)-'0')); // 뒤에 '0'은,,문자가 아닌 숫자 그대로의 값을 쓰기 위함.
		System.out.println(a * (b.charAt(1)-'0'));
		System.out.println(a * (b.charAt(0)-'0'));
		System.out.println(a * Integer.parseInt(b)); //결과값
		


		
	}
}
