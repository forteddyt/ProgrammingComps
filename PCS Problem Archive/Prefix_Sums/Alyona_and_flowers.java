import java.util.*;

/**
 * Found at https://pcs.cs.cloud.vt.edu/contests/41/problems/A
**/

public class Alyona_and_flowers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		long[] prefixSums = new long[n];
		long[] happiness = new long[m];
		long maxHappy = 0;

		for(int i = 0; i < n; i++){
			prefixSums[i] = scan.nextInt() + (i == 0 ? 0 : prefixSums[i - 1]);
		}

		for(int i = 0; i < m; i++){
			int start = scan.nextInt() - 1;
			int end = scan.nextInt() - 1;

			if(start == 0){
				happiness[i] = prefixSums[end];
			}else{
				happiness[i] = prefixSums[end] - prefixSums[start - 1]; 
			}

			if(happiness[i] > 0){
				maxHappy += happiness[i];
			}
		}

		System.out.println(maxHappy);
	}
}