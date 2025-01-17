
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println("name");
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getData2();
		d.getData3();
	}


	public String getData()
	{
		System.out.println("Pankaj");
		return "niraj";
	}
	
	public static String getData3()
	{
		System.out.println("Pankajp");
		return "nirajp";

}}