import java.util.*;

public class Parallelogram_is_back{
	public static void main(String[] args) {
		new Parallelogram_is_back();
	}

	public Parallelogram_is_back(){
		Scanner scan = new Scanner(System.in);
		Point a = new Point(scan.nextInt(), scan.nextInt());
		Point b = new Point(scan.nextInt(), scan.nextInt());
		Point c = new Point(scan.nextInt(), scan.nextInt());

		Point v1 = a.sub(c); // Vector from a to c
		Point v2 = c.sub(b); // Vector from c to b
		Point v3 = b.sub(a); // Vector from b to a

		Point p1 = b.add(v1);
		Point p2 = a.add(v2);
		Point p3 = c.add(v3);

		System.out.println(3); // Will always only ever be 3 answers
		System.out.println(p1.x + " " + p1.y);
		System.out.println(p3.x + " " + p3.y);
		System.out.println(p2.x + " " + p2.y);
	}

	public class Point{
		int x;
		int y;

		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}

		private Point sub(Point p){
			return new Point(x - p.x, y - p.y);
		}

		private Point add(Point p){
			return new Point(x + p.x, y + p.y);
		}
	}
}