public class RandomZero {
	public static void main(String[] args) {
		int num[][] = new int[4][4];
		int tmp, cnt=0;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				tmp = (int)(Math.random()*2);
				if(tmp==0) cnt++;
				if(cnt > 6) num[i][j] = 1;
				else num[i][j] = tmp;
			}
		}
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(num[i][j]==1) num[i][j] = (int)(Math.random()*10+1);
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
