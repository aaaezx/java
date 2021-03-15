import java.util.Scanner;

public class IntegetInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int temp = input;
		int ten = input/10;
		int one = temp%10;
		if(ten==one) {
			System.out.println("Yes!!");
		}
		else {
			System.out.println("No!!");
		}
	}
}
