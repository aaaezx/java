import java.util.Scanner;
class Reservation{ //예약자 명단을 저장하기 위한 class
	private int num; //1부터 10까지의 좌석번호
	private int seat_num; //S, A, B 구분된 좌석
	private String name; //예약 혹은 취소하는 사람의 이름
	public Reservation(int seat_num, int num, String name) { //정보를 저장함
		this.seat_num = seat_num;
		this.num = num;
		this.name = name;
	}
}
class Re_system{
	private String s_seat[] = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	private String a_seat[] = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	private String b_seat[] = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	//각 좌석 10 크기만큼의 배열 선언. 빈좌석은 "---" 로 표시한다.
	Reservation info[]; //Reservation 배열 선언
	Scanner s = new Scanner(System.in);
	Re_system(){ //입력을 받을 매개변수는 없으므로 괄호 안은 비워둔다.
		info = new Reservation[30];
		//S, A, B 모두 통틀어서 좌석은 단 30개밖에 없으니까 30만큼의 크기 할당
		for(int i=0; i<30; i++) info[i] = new Reservation(0, 0, "");
		//크기가 할당된 배열은 각 자료형에 맞게 초기화를 시켜준다.
		//차례대로 seat_num, num, name 순이다.
	}
	void input_info() { //콘서트 예약 시스템을 위한 메서드
		int ch_num; //메뉴선택 값을 받기 위한 변수
		int seat_num; //구분된 좌석 값을 받기 위한 변수
		String name; //예약 or 취소할 사람의 이름을 받기 위한 변수
		int seat; //1부터 10까지의 좌석번호를 받기위한 함수
		int z = 0; //info 배열을 위한 함수, 즉 info[z] 로 쓰여짐
		boolean serch; //예약 취소를 하는 사람의 이름이 올바른 이름인지 판별하기 위한 변수
		System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
		ch_num = s.nextInt();
		while(ch_num<=0||ch_num>4) { //ch_num 0보다 작거나 같을 때 또는 4보다 클 때 while문 실행
			System.out.println("잘못된 메뉴 선택입니다.");
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			ch_num=s.nextInt();
		} //ch_num에 올바른 값이 들어가있다면 while문 종료
		while(ch_num!=4) {
			if(ch_num==1) {
				System.out.print("좌석구분 : S(1), A(2), B(3)>>");
				seat_num = s.nextInt();
				while(seat_num>3 || seat_num<1) {
					System.out.print("1부터 3까지 숫자를 입력해주세요>>");
					seat_num = s.nextInt();
				}
				if(seat_num==1) {
					System.out.print("S>>");
					for(int i=0; i<10; i++) {
						System.out.print(s_seat[i]+" ");
					}
					System.out.println();
					System.out.print("이름>>");
					name=s.next();
					System.out.print("번호>>");
					seat=s.nextInt();
					while(seat>10) {
						System.out.print("1부터 10까지 숫자를 입력해주세요>>");
						seat = s.nextInt();
					}
					while(s_seat[seat-1].equals("---")!=true) {
						System.out.print("이미 선택된 좌석입니다. 다른 좌석을 선택해주세요 (1~10)>>");
						seat = s.nextInt();
						while(seat>10) {
							System.out.print("1부터 10까지 숫자를 입력해주세요>>");
							seat = s.nextInt();
						}
					}
					info[z] = new Reservation(seat_num, seat, name);
					s_seat[seat-1] = name;
				}
				if(seat_num==2) {
					System.out.print("A>>");
					for(int i=0; i<10; i++) {
						System.out.print(a_seat[i]+" ");
					}
					System.out.println();
					System.out.print("이름>>");
					name=s.next();
					System.out.print("번호>>");
					seat=s.nextInt();
					while(seat>10) {
						System.out.print("1부터 10까지 숫자를 입력해주세요>>");
						seat = s.nextInt();
					}
					while(a_seat[seat-1].equals("---")!=true) {
						System.out.print("이미 선택된 좌석입니다. 다른 좌석을 선택해주세요 (1~10)>>");
						seat = s.nextInt();
						while(seat>10) {
							System.out.print("1부터 10까지 숫자를 입력해주세요>>");
							seat = s.nextInt();
						}
					}
					info[z] = new Reservation(seat_num, seat, name);
					a_seat[seat-1] = name;
				}
				if(seat_num==3) {
					System.out.print("B>>");
					for(int i=0; i<10; i++) {
						System.out.print(b_seat[i]+" ");
					}
					System.out.println();
					System.out.print("이름>>");
					name=s.next();
					System.out.print("번호>>");
					seat=s.nextInt();
					while(seat>10) {
						System.out.print("1부터 10까지 숫자를 입력해주세요>>");
						seat = s.nextInt();
					}
					while(b_seat[seat-1].equals("---")!=true) {
						System.out.print("이미 선택된 좌석입니다. 다른 좌석을 선택해주세요 (1~10)>>");
						seat = s.nextInt();
						while(seat>10) {
							System.out.print("1부터 10까지 숫자를 입력해주세요>>");
							seat = s.nextInt();
						}
					}
					info[z] = new Reservation(seat_num, seat, name);
					b_seat[seat-1] = name;
				}
			}
			if(ch_num==2) {
				System.out.print("S>>");
				for(int i=0; i<10; i++)System.out.print(s_seat[i] + " ");
				System.out.println( );
				System.out.print("A>>");
				for(int i=0; i<10; i++)System.out.print(a_seat[i] + " ");
				System.out.println( );
				System.out.print("B>>");
				for(int i=0; i<10; i++)System.out.print(b_seat[i] + " ");
				System.out.println( );
			}
			if(ch_num==3) {
				System.out.print("좌석 : S(1), A(2), B(3)>>");
				seat_num = s.nextInt();
				if(seat_num==1) {
					System.out.print("S>>");
					for(int i=0; i<10; i++)System.out.print(s_seat[i] + " ");
					System.out.println( );
					System.out.print("이름>>");
					name=s.next();
					serch=false;
					for(int i=0; i<10; i++) {
						if(s_seat[i].equals(name)==true) {
							s_seat[i]="---";
							break;
						}
						if(i==9) {
							while(serch==false) {
								System.out.print("잘못된 이름입니다. 다시 입력하세요>>");
								name=s.next();
								for(int j=0; j<10; j++) {
									if(s_seat[j].equals(name)==true) {
										s_seat[j]="---";
										serch=true;
										break;
									}
								}	
							}
						}
					}
				}
				if(seat_num==2) {
					System.out.print("A>>");
					for(int i=0; i<10; i++)System.out.print(a_seat[i] + " ");
					System.out.println( );
					System.out.print("이름>>");
					name=s.next();
					serch=false;
					for(int i=0; i<10; i++) {
						if(a_seat[i].equals(name)==true) {
							a_seat[i]="---";
							break;
						}
						if(i==9) {
							while(serch==false) {
								System.out.print("잘못된 이름입니다. 다시 입력하세요>>");
								name=s.next();
								for(int j=0; j<10; j++) {
									if(a_seat[j].equals(name)==true) {
										a_seat[j]="---";
										serch=true;
										break;
									}
								}	
							}
						}
					}
				}
				if(seat_num==3) {
					System.out.print("B>>");
					for(int i=0; i<10; i++)System.out.print(b_seat[i] + " ");
					System.out.println( );
					System.out.print("이름>>");
					name=s.next();
					serch=false;
					for(int i=0; i<10; i++) {
						if(b_seat[i].equals(name)==true) {
							b_seat[i]="---";
							break;
						}
						if(i==9) {
							while(serch==false) {
								System.out.print("예약된 이름이 아닙니다. 다시 입력해주세요>>");
								name=s.next();
								for(int j=0; j<10; j++) {
									if(b_seat[j].equals(name)==true) {
										b_seat[j]="---";
										serch=true;
										break;
									}
								}	
							}
						}
					}
				}
				
			}
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			ch_num=s.nextInt();
			while(ch_num<=0||ch_num>4) {
				System.out.println("잘못된 메뉴 선택입니다.");
				System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
				ch_num=s.nextInt();
			}
			z++;
		}
	}
}
public class concert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Re_system r = new Re_system();
		r.input_info();
	}

}
