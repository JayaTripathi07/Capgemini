public class Notebook {
	String name;
	float cost;
	int pages;
	
	public Notebook(String name, float cost, int pages) {
		this.name = name;
		this.cost = cost;
		this.pages = pages;
	}

	
public static void main(String[] args) {
	Notebook p = new Notebook("Classmate",60f,200);
	System.out.println(p.name);
	System.out.println(p.cost);
	System.out.println(p.pages);
	}
}
