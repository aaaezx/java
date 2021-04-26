import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print(">> ");
			try {
				int n = s.nextInt();
			    int m = s.nextInt();
			    System.out.println(n + "x" + m + "=" + n*m);
			    break;
			}
		    catch(InputMismatchException e){
			    System.out.println("error");
			    s.nextLine();
		    }
		}
		s.close();
	}
}
