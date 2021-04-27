import java.util.Scanner;
public class RectangularConflicts {
	public static boolean inRect(int x, int y, int x1, int y1, int x2, int y2) {
		if((x>=x1 && x<=x2) && (y>=y1 && y<=y2)) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		boolean answer = inRect(x, y, 100, 100, 200, 200);
		if(answer==true) {
			if(inRect(x1, y1, 100, 100, 200, 200)==true) System.out.println("Not Conflicts");
			else System.out.println("Conflicts");
		}
		else {
			if(inRect(x1, y1, 100, 100, 200, 200)==true) System.out.println("Conflicts");
			else System.out.println("Not Conflicts");
		}
		s.close();
	}
}
