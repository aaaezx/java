import java.util.Scanner;
public class CourseAndScore {
	public static void main(String[] args) {
		String course[] = {"Java", "C++", "HTML5"};
		int score[] = {95, 88, 76};
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print(">> ");
			String input = s.next();
			if(input.equals("stop")) break;
			else {
				int index = -1;
				for(int i=0; i<course.length; i++) {
					if(input.equals(course[i])) {
						index=i;
					}
				}
				if(index!=-1) System.out.println(score[index]);
				else System.out.println("Not course");
			}
		}
	}
}
