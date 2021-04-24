public class Random {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10];
		for(int j=0; j<num.length; j++) {
			num[j] = (int)(Math.random()*10+1);
		}
		int sum = 0;
		System.out.print(">>");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
			sum = sum + num[i];
		}
		System.out.println();
		System.out.println((double)sum/10);
	}

}
