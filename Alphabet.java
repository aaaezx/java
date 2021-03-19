import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("input >> ");
		char alpha=s.next().charAt(0);
		for(int i=0; i<=alpha-'a'; i++) {
			for(char j='a'; j<=alpha-i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		s.close();
	}
}
