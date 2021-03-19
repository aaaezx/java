import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input=s.nextInt();
		for(int i=0; i<input; i++) {
			for(int j=input; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		s.close();
	}

}
