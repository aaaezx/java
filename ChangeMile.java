import java.util.Scanner;
abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println(getSrcString() + " change->" + getDestString());
		System.out.println(getSrcString() + ">> ");
		double val = s.nextDouble();
		double res = convert(val);
		System.out.println("result : " + res + getDestString());
		s.close();
	}
}
class Km2Mile extends Converter{
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src / ratio;
	}
	protected String getSrcString() { return "Km"; }
	protected String getDestString() { return "Mile"; }
}
public class ChangeMile {
	public static void main(String args[]) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
