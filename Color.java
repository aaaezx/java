import java.util.Scanner;
class Point{
	private int x, y;
	public Point() {
		x = 0;
		y = 0;
	} 
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int get_x() {
		return x;
	}
	public int get_y() {
		return y;
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class ColorPoint extends Point{
	private String c;
	public ColorPoint() {
		c = "Black";
	}
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String c) {
		this.c = c;
	}
	public String toString() {
		return c+" (" + get_x() +", " + get_y() +")";
	}
}
public class Color {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString());
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString());
	}

}
