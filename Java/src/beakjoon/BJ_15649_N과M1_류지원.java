package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_15649_N과M1_류지원 {
	static int N;
	static boolean[] isSelected;
	static int[] numbers;
	static int M;
	
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer ST = new StringTokenizer(br.readLine());
        N = Integer.parseInt(ST.nextToken());
        M = Integer.parseInt(ST.nextToken());
        
        isSelected = new boolean[N];
        numbers = new int[M];
        asdf(0);
    }
    
    public static void asdf(int cnt) {
    	if(cnt==M) {
    		for(int i=0;i<M;i++)System.out.print((numbers[i]+1)+" ");
    		System.out.println();
    		return;
    	}
    	
    	for(int i=0; i<N; i++) {
    		if(isSelected[i]==false) {
    			numbers[cnt]=i;
    			isSelected[i]=true;
    			asdf(cnt+1);
    			isSelected[i]=false;
    		}
    	}
    }
}
