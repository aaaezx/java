import java.util.Scanner;
public class integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input[]=new int[10];
		int sum=0;
		for(int i=0; i<10; i++) {
			input[i]=s.nextInt();
			if(input[i]>0)
				sum+=input[i];
		}
		System.out.println(sum);
	}

}
