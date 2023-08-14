package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_01074_Z_류지원 {
	static int count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer ST = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(ST.nextToken());
        int r = Integer.parseInt(ST.nextToken());
        int c = Integer.parseInt(ST.nextToken());
        int S = (int)Math.pow(2, N);
        int[][] arr=new int[S][S];
        int n = counter(S);
        for(int i=0; i<S; i++) System.out.println(Arrays.toString(arr[i]));
    }

//    public static int[][] counter(int[][] arr, int S) {
//        if(S==2) return new int[][] {{count++,count++},{count++,count++}};
//        int hs=S/2;
//        int[][] LTArr=counter(new int[hs][hs], hs);    // 왼위
//    	int[][] RTArr=counter(new int[hs][hs], hs);    // 오위
//    	int[][] LBArr=counter(new int[hs][hs], hs);    // 왼아
//    	int[][] RBArr=counter(new int[hs][hs], hs);    // 오아
//        for(int i=0; i<hs; i++) {
//        	for(int j=0; j<hs; j++) {
//        		arr[i][j]=LTArr[i][j];
//        		arr[i][j+S/2]=RTArr[i][j];
//        		arr[i+S/2][j]=LBArr[i][j];
//        		arr[i+S/2][j+S/2]=RBArr[i][j];
//        	}
//        }
//        return arr;
//    }
    
    public static int counter(int S) {
    	if(S==1) return count++;
    }

}
