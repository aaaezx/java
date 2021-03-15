import java.util.Scanner;
public class MiddleNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int middle = 0;
		
		if(a>b && a>c) {
			if(b<c)
				middle=c;
			else if(b>c)
				middle=b;
		}
		else if(b>c && b>a) {
			if(a<c)
				middle=c;
			else if(a>c)
				middle=a;
		}
		else if(c>a && c>b) {
			if(a<b)
				middle=b;
			else if(a>b)
				middle=a;
		}
		
		System.out.println(middle);

	}

}
