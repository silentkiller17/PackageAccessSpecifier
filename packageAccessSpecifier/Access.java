package packageAccessSpecifier;
class Student{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id=i;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
}

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student sc=new Student();
sc.setName("Shital Meshram");
System.out.println(sc.getName());
sc.setId(10);
System.out.println(sc.getId());
	}

}
