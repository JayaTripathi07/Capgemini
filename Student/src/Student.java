
public class Student {
		
		private String name;
	    private int rollNo;
	    private String stream;

	public void setname(String name) {
	        this.name = name;
	    }

	    public void setrollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }

	    public void setstream(String stream) {
	        this.stream = stream;
	    }
	        public String getname() {
	        return name;
	    }

	    public int getrollNo() {
	        return rollNo;
	    }

	    public String getstream() {
	        return stream;
	}
	    public String toString() {
	     
	    return "Name";
	    		}

	public static void main(String[] args) {
	
		Student s = new Student();
        s.setname("Radhika");
        s.setrollNo(34);
        s.setstream("CSE");
        
        System.out.println(s.getname());
        System.out.println(s.getrollNo());
        System.out.println(s.getstream());
        System.out.println(s.toString());
	}

}
