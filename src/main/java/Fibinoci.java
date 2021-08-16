
public class Fibinoci {
	
	public static int getFibinoi(int givenNum)
	{
		int f1=0;
		int f2=1;
		int f3 = 0;
//		System.out.println(f1);
//		System.out.println(f2);
		for (int i=0;i<givenNum-1;i++)
		{

		f3=f1+f2;
		f1=f2;
		f2=f3;
		
		}
		
		return f3;
	}

	public static void main(String[] args) {
		
		System.out.println(getFibinoi(9));
		// TODO Auto-generated method stub

	}

}
