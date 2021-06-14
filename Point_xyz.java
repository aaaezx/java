class Pointer{
	private int x, y;
	public Pointer(int x, int y) { this.x = x; this.y = y; }
	protected int getX() { return x; }
	protected int getY() { return y; }
	public void move(int x, int y) { this.x = x; this.y =  y; }
}
class Point3D extends Pointer{
	private int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public int moveUp() { return z+=1; }
	public int moveDown() { return z-=1; }
	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	public String toString() { return "(" + getX() + "," + getY() + "," + z + ")"; }
}
public class Point_xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString());
		
		p.moveUp();
		System.out.println(p.toString());
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString());
		
		p.move(100, 200, 300);
		System.out.println(p.toString());
	}

}
