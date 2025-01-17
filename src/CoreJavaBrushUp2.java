import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr3 = { 1,2 ,4, 8, 11, 16, 18, 76, 83, 186};
		
		for (int i = 0; i< arr3.length; i++)
		{
			if (arr3[i] %2 ==0)
{
	System.out.println(arr3[i]);
	break;
}
	
	else
		
	{
		System.out.println(arr3[i] +"not multiple of 2");
}
		
		}	
		
		//arraylist
	
	ArrayList<String> a = new ArrayList<String>();
	a.add("pankaj");
	a.add("rahul");
	a.add("java");
	a.add("selenium");
	System.out.println(a.get(2));
	System.out.println(a.contains("selenium"));
	
	String[] str3 = {"pankaj", "niraj"};
	
	List<String> nameArrayList = Arrays.asList(str3);
	nameArrayList.contains("niraj");
	
		}

}
