import java.util.Scanner;
class Phone{ //Phone class
	private String name;
	private String tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	String getname() {return name;}
	String gettel() {return tel;}
}
class Pbook{ //Pbook class
	Scanner s = new Scanner(System.in);
	Phone serchPhone[];
	int num;
	Pbook(int num){ 
		this.num = num;
		serchPhone = new Phone[num]; 
		for(int i=0; i<num; i++) serchPhone[i]=new Phone("", ""); 
	}
	void getNameANDTel() { 
		for(int i=0; i<num; i++) {
			System.out.print("Name and Tel>>>");
			String name=s.next();
			String tel=s.next();
			serchPhone[i] = new Phone(name, tel); 
		}
	}
	void findName() {
		System.out.print("serch Name>>");
		String find=s.next();
		while(find.equals("stop")!=true) { 
			for(int i=0; i<num; i++) {
				if(serchPhone[i].getname().equals(find)==true) {
					System.out.println(find+" "+serchPhone[i].gettel());
					break;
				}
				if(i==num-1)
					System.out.println("There is no name for "+find);
			}
			System.out.println("serch Name>>");
			find=s.next();
		}
	}
}
public class PhoneBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int people=s.nextInt();
		Pbook myPhone = new Pbook(people);
		myPhone.getNameANDTel();
		myPhone.findName();
		s.close();
	}
}