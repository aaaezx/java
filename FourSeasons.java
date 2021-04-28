import java.util.Scanner;
public class FourSeasons {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		switch(input) {
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Fall");
			break;
		case 12:
			System.out.println("Winter");
			break;
			default:
				System.out.println("error");
		}
		s.close();
	}
}
