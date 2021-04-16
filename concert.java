import java.util.Scanner;
class Reservation{ //������ ����� �����ϱ� ���� class
	private int num; //1���� 10������ �¼���ȣ
	private int seat_num; //S, A, B ���е� �¼�
	private String name; //���� Ȥ�� ����ϴ� ����� �̸�
	public Reservation(int seat_num, int num, String name) { //������ ������
		this.seat_num = seat_num;
		this.num = num;
		this.name = name;
	}
}
class Re_system{
	private String s_seat[] = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	private String a_seat[] = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	private String b_seat[] = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	//�� �¼� 10 ũ�⸸ŭ�� �迭 ����. ���¼��� "---" �� ǥ���Ѵ�.
	Reservation info[]; //Reservation �迭 ����
	Scanner s = new Scanner(System.in);
	Re_system(){ //�Է��� ���� �Ű������� �����Ƿ� ��ȣ ���� ����д�.
		info = new Reservation[30];
		//S, A, B ��� ��Ʋ� �¼��� �� 30���ۿ� �����ϱ� 30��ŭ�� ũ�� �Ҵ�
		for(int i=0; i<30; i++) info[i] = new Reservation(0, 0, "");
		//ũ�Ⱑ �Ҵ�� �迭�� �� �ڷ����� �°� �ʱ�ȭ�� �����ش�.
		//���ʴ�� seat_num, num, name ���̴�.
	}
	void input_info() { //�ܼ�Ʈ ���� �ý����� ���� �޼���
		int ch_num; //�޴����� ���� �ޱ� ���� ����
		int seat_num; //���е� �¼� ���� �ޱ� ���� ����
		String name; //���� or ����� ����� �̸��� �ޱ� ���� ����
		int seat; //1���� 10������ �¼���ȣ�� �ޱ����� �Լ�
		int z = 0; //info �迭�� ���� �Լ�, �� info[z] �� ������
		boolean serch; //���� ��Ҹ� �ϴ� ����� �̸��� �ùٸ� �̸����� �Ǻ��ϱ� ���� ����
		System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
		ch_num = s.nextInt();
		while(ch_num<=0||ch_num>4) { //ch_num 0���� �۰ų� ���� �� �Ǵ� 4���� Ŭ �� while�� ����
			System.out.println("�߸��� �޴� �����Դϴ�.");
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			ch_num=s.nextInt();
		} //ch_num�� �ùٸ� ���� ���ִٸ� while�� ����
		while(ch_num!=4) {
			if(ch_num==1) {
				System.out.print("�¼����� : S(1), A(2), B(3)>>");
				seat_num = s.nextInt();
				while(seat_num>3 || seat_num<1) {
					System.out.print("1���� 3���� ���ڸ� �Է����ּ���>>");
					seat_num = s.nextInt();
				}
				if(seat_num==1) {
					System.out.print("S>>");
					for(int i=0; i<10; i++) {
						System.out.print(s_seat[i]+" ");
					}
					System.out.println();
					System.out.print("�̸�>>");
					name=s.next();
					System.out.print("��ȣ>>");
					seat=s.nextInt();
					while(seat>10) {
						System.out.print("1���� 10���� ���ڸ� �Է����ּ���>>");
						seat = s.nextInt();
					}
					while(s_seat[seat-1].equals("---")!=true) {
						System.out.print("�̹� ���õ� �¼��Դϴ�. �ٸ� �¼��� �������ּ��� (1~10)>>");
						seat = s.nextInt();
						while(seat>10) {
							System.out.print("1���� 10���� ���ڸ� �Է����ּ���>>");
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
					System.out.print("�̸�>>");
					name=s.next();
					System.out.print("��ȣ>>");
					seat=s.nextInt();
					while(seat>10) {
						System.out.print("1���� 10���� ���ڸ� �Է����ּ���>>");
						seat = s.nextInt();
					}
					while(a_seat[seat-1].equals("---")!=true) {
						System.out.print("�̹� ���õ� �¼��Դϴ�. �ٸ� �¼��� �������ּ��� (1~10)>>");
						seat = s.nextInt();
						while(seat>10) {
							System.out.print("1���� 10���� ���ڸ� �Է����ּ���>>");
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
					System.out.print("�̸�>>");
					name=s.next();
					System.out.print("��ȣ>>");
					seat=s.nextInt();
					while(seat>10) {
						System.out.print("1���� 10���� ���ڸ� �Է����ּ���>>");
						seat = s.nextInt();
					}
					while(b_seat[seat-1].equals("---")!=true) {
						System.out.print("�̹� ���õ� �¼��Դϴ�. �ٸ� �¼��� �������ּ��� (1~10)>>");
						seat = s.nextInt();
						while(seat>10) {
							System.out.print("1���� 10���� ���ڸ� �Է����ּ���>>");
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
				System.out.print("�¼� : S(1), A(2), B(3)>>");
				seat_num = s.nextInt();
				if(seat_num==1) {
					System.out.print("S>>");
					for(int i=0; i<10; i++)System.out.print(s_seat[i] + " ");
					System.out.println( );
					System.out.print("�̸�>>");
					name=s.next();
					serch=false;
					for(int i=0; i<10; i++) {
						if(s_seat[i].equals(name)==true) {
							s_seat[i]="---";
							break;
						}
						if(i==9) {
							while(serch==false) {
								System.out.print("�߸��� �̸��Դϴ�. �ٽ� �Է��ϼ���>>");
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
					System.out.print("�̸�>>");
					name=s.next();
					serch=false;
					for(int i=0; i<10; i++) {
						if(a_seat[i].equals(name)==true) {
							a_seat[i]="---";
							break;
						}
						if(i==9) {
							while(serch==false) {
								System.out.print("�߸��� �̸��Դϴ�. �ٽ� �Է��ϼ���>>");
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
					System.out.print("�̸�>>");
					name=s.next();
					serch=false;
					for(int i=0; i<10; i++) {
						if(b_seat[i].equals(name)==true) {
							b_seat[i]="---";
							break;
						}
						if(i==9) {
							while(serch==false) {
								System.out.print("����� �̸��� �ƴմϴ�. �ٽ� �Է����ּ���>>");
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
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			ch_num=s.nextInt();
			while(ch_num<=0||ch_num>4) {
				System.out.println("�߸��� �޴� �����Դϴ�.");
				System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
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
