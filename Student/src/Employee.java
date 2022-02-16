
public class Employee {
	String name;
	int empId;
	int age;
	int empSalary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
        e.setName("XYZ");
        e.setEmpId(345);
        e.setEmpSalary(50000);
        e.setAge(21);
        
        System.out.println(e.getName());
        System.out.println(e.getEmpId());
        System.out.println(e.getEmpSalary());
        System.out.println(e.getAge());
        
	}

}
