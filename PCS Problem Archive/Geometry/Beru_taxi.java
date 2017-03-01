import java.util.*;

public class Beru_taxi{

	public static void main(String[] args) {
		new Beru_taxi();
	}

	public Beru_taxi(){
		Scanner scan = new Scanner(System.in);
		int startX = scan.nextInt();
		int startY = scan.nextInt();
		double fastestTime = Double.MAX_VALUE;

		int n = scan.nextInt();

		for(int i = 0; i < n; i++){
			int carX = scan.nextInt();
			int carY = scan.nextInt();
			int speed = scan.nextInt();

			if(speed == 0){
				continue;
			}

			int disX = carX - startX;
			int disY = carY - startY;
			double distance = Math.sqrt(disX * disX + disY * disY);

			double time = distance / speed;

			if(time < fastestTime){
				fastestTime = time;
			} 
		}

		System.out.println(fastestTime);
	}
}