import java.util.Scanner;
class Maximumm
{
	public static void main string[]args)																								
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b,c,max;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		 max=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Large number is" +max);
	}
}