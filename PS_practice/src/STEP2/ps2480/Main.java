package ps2480;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
 
		
		//3) ��� �ٸ� �� 
		if (a != b && b != c && a != c) {
			
			int max;				
			
			if (a > b) {
				if (c > a) { // c > a > b
					max = c;
				} 
				else {		// a > ...
					max = a;
				}
			}

			//--------------------------------------------------------------	
			
			else {
				if (c > b) { // c > b > a
					max = c;
				}
				else {		// b > ...
					max = b;
				}
			}
			System.out.println(max * 100); //3)
		}//if end
		
		//--------------------------------------------------------------
		
		else {
			
			if (a == b && a == c) { // 1)
				System.out.println(10000 + a * 1000);
			}
			
			//--------------------------------------------------------------
			
			else { //2)
				if(a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				else { // b == c
					System.out.println(1000 + b * 100);
				}
			}
			
		}//else end
	}
}