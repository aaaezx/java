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
class Won2Dollar extends Converter{
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() { return "Won"; }
	protected String getDestString() { return "Dollar"; }
}
public class ChangeMoney {
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}
