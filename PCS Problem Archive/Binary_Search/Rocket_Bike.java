import java.util.*;

public class Rocket_Bike{

	public static void main(String[] args){
		new Rocket_Bike();
	}

	public Rocket_Bike(){
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int width = scan.nextInt();

		double time = Math.sqrt(height * 2.0 / 9.81);
		double velocityNeeded = width / time;

		double low = 0;
		double high = 3;

		while((high - low) > .000000001){
			double mid = (high + low) / 2;
			double output = 2 * Math.pow(mid, 5) + 3 * Math.pow(mid, 4) + mid;
			
			if(output < velocityNeeded){
				low = mid;
			}else if(output > velocityNeeded){
				high = mid;
			}
		}

		System.out.println((high + low) / 2);
	}
}