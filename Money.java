import java.util.Scanner;
public class Money {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int money[] = {50000, 10000, 5000, 1000, 500, 100, 10, 1};
		int input = s.nextInt();
		for(int i=0; i<money.length; i++) {
			if(input>=money[i]) {
				System.out.println(money[i] + ">> " + input/money[i]);
				input = input - ((input/money[i])*money[i]);
			}
		}
		s.close();
	}
}
