package ps10807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int []arr =new int[n];
        
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i< n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        int Num = Integer.parseInt(br.readLine());
        int count= 0;
        
        for (int i=0; i< arr.length; i++) {
        	if(arr[i]==Num) {
        		count++;
        	}
        }
        bw.write(count+" ");
        bw.flush();
	}

}
