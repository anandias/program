package numbers;

public class ArmStrongNumber2 {
	public static void main(String[] args) {
		int a = 153;
		int b=a;
		
//		1^digit+5^digit+3^digit = 153
//		1^3+5^3+3^3 + 153
		int digit= 0;
		int sum=0;
		int temp=a;
		int rem=0;
		
		while(a>0)
		{
			a=a/10;
			digit++;
		}
		
		while(b>0)
		{
			rem=b%10;
			int prod=1;
			int c=digit;
			while(c>0)
			{
				prod=prod*rem;
				c--;
			}
			sum=sum+prod;
			b=b/10;
		}
		if(temp==sum)
		{
			System.out.println("arm");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
