
public class Car {
	private String name;
    private int modelNo;
    private String brand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public static void main(String[] args) {
		
		Car s = new Car();
        s.setName("Nexon");
        s.setModelNo(34);
        s.setBrand("Tata");
        
        System.out.println(s.getName());
        System.out.println(s.getModelNo());
        System.out.println(s.getBrand());

	}
}
