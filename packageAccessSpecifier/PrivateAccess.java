package packageAccessSpecifier;
class Demo{
	private String name="Shital";
	void display() {
		System.out.println("name: "+ name);
	}
	Demo(String nm){
		name=nm;
		System.out.println("name: "+ name);
	}
}
public class PrivateAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello";
Demo d=new Demo("Meshram");
System.out.println(s);

	}

}
