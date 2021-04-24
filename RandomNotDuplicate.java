import java.util.Scanner;
public class RandomNotDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int num[] = new int[i];
		for(int j = 0; j<num.length; j++) {
			num[j] = (int)(Math.random()*100+1);
			for(int z = 0; z<j; z++) {
				if(num[j]==num[z]) j--;
			}
		}
		for(int n = 0; n<num.length; n++) {
			System.out.print(num[n] + " ");
			if((n%10)>0 && (n%10)%9==0) System.out.println();
		}
		System.out.println();
		s.close();
	}
}
