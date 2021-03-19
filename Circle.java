import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("first >>");
		int x=s.nextInt();
		int y=s.nextInt();
		int radius=s.nextInt();
		System.out.print("second >>");
		int x2=s.nextInt();
		int y2=s.nextInt();
		int radius2=s.nextInt();
		double distance = Math.sqrt(((x-x2)*(x-x2))+((y-y2)*(y-y2)));
		int result = radius+radius2;
		if(result >distance) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
