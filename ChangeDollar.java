import java.util.Scanner;
public class ChangeDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();
		double money_change = money/1100;
		System.out.println(money_change);
	}

}
