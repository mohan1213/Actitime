import java.util.Scanner;
class Array6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int[]a=new int[sc.nextInt()];
		System.out.println("enter numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int esum=0;
		int osum=0;
		for(int i=0;i,a.length;i++)
		{
			if(a[i]%2==0)
			{
				esum=esum+a[i];
			}
			else if(a[i]%2==1)
			{
				osum=osum+a[i];
			}
		}
		System.out.println(esum);
		System.out.println(osum);
	}
}
