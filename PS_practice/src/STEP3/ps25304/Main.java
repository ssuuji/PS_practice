package ps25304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long total = sc.nextLong(); //구매한 물건의 총 가격
		int su = sc.nextInt();//물건의 종류 수
		
		long total2=0;
		for (int i =0; i<su ; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			total2 = total2 + (price*num) ;
		}
		
		if (total == total2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
