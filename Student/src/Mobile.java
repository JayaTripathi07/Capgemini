
public class Mobile {

	String name;
	int modleNo;
	int price;
	String softwareVersion;
	String brand;
	int battery;
	
	Mobile(String name,int modleNo, int price, String softwareVersion, String brand, int battery)
	{
		this.name = name;
		this.modleNo = modleNo;
		this.price = price;
		this.softwareVersion = softwareVersion;
		this.brand = brand;
		this.battery = battery;
	}

	public static void main(String[] args) {
		Mobile m = new Mobile("iPhone",23543,75000,"IOS","Apple",3095);
		System.out.println(m.name);
		System.out.println(m.modleNo);
		System.out.println(m.price);
		System.out.println(m.softwareVersion);
		System.out.println(m.brand);
		System.out.println(m.battery);

	}

}
