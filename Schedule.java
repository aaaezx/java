import java.util.Scanner;
class Day{
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work==null) System.out.println("Not work");
		else System.out.println(work);
	}
}
class MonthSchedule{
	private int day;
	private Day days[];
	Scanner s = new Scanner(System.in);
	public MonthSchedule(int day) {
		this.day = day;
		days = new Day[day];
	}
	public void input() {
		System.out.print("day(1~30)? >> ");
		int day = s.nextInt();
		System.out.print("Things to do? >> ");
		String work = s.next();
		days[day-1] = new Day();
		days[day-1].set(work);
		System.out.println();
	}
	public void view() {
		System.out.print("day(1~30)? >> ");
		int date = s.nextInt();
		days[date-1].show();
		System.out.println();
	}
	public void finish() {
		System.out.println("Exit Program");
	}
	public void run() {
		while(true) {
			System.out.print("input:1, view:2, finish:3 >> ");
			int choice = s.nextInt();
			if(choice==1) {
				input();
			}
			else if(choice==2) {
				view();
			}
			else if(choice==3) {
				finish();
				break;
			}
			else {
				System.out.println("error");
			}
		}
	}
	
}
public class Schedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
