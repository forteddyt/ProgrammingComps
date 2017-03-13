import java.util.*;

public class Interesting_Drink{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] shops = new int[100_001];

		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			int num = scan.nextInt();
			shops[num] = shops[num] + 1;
		}

		for(int i = 1; i < shops.length; i++){
			shops[i] = shops[i] + shops[i-1];
		}
		int m = scan.nextInt();

		for(int i = 0; i < m; i++){
			System.out.println(shops[scan.nextInt()] + "");
		}
	}
}