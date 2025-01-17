
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		String str = "Pankaj is studying";
		double y = 10.25;
		boolean z = true;
		char u = 'r';
		
		System.out.println(x +  "haaga helia");
		System.out.println(str);
		System.out.println(y);
		System.out.println(z);
		System.out.println(u);
		
		//arrays
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2]= 3;
		arr[3]=6;
		arr[4]=9;
				
		int [] arr2 = {1,2,3,4,5};
		System.out.println(arr2[2]);
		
		//for
		
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] str3 = {"pankaj", "niraj"};
		
		for ( int i =0; i<str3.length; i++)
		{
			System.out.println(str3[i]);
		
		}
		
		for ( String s: str3)
		{
			System.out.println(s);
		}
	}

}
