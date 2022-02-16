
public class Pen {
	String name;
	int cost;
	float pointmm;
	
	public Pen(String name, int cost, float pointmm) {
		this.name = name;
		this.cost = cost;
		this.pointmm = pointmm;
	}

	
public static void main(String[] args) {
	Pen p = new Pen("Hi_Techpoint",60,0.5f);
	System.out.println(p.name);
	System.out.println(p.cost);
	System.out.println(p.pointmm);
	}
}
