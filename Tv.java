class television{
	private int size;
	public television(int size) { this.size = size; }
	protected int getSize() { return size; }
}
class Colortv extends television{
	private int color;
	Colortv(int size, int color){
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize() + "inch " + color + "color");
	}
	public int getColor() {return color;}
}
class IPTV extends Colortv{
	private String ip;
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	@Override
	public void printProperty() {
		System.out.println("my IPTV = " + ip + " address " + getSize() + "inch " + getColor() + "color");
	}
}
public class Tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
