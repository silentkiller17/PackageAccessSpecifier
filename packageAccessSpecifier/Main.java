package packageAccessSpecifier;

class Base{
	public void show() {
		System.out.println("Base::show()called");
	}
}
class Derived extends Base
{
public void show() {
	System.out.println("Derived::show()called");
}
}
	public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Base b=new Derived();
     b.show();
	}

}
