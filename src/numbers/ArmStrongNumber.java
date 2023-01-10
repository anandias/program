package numbers;

public class ArmStrongNumber {
	public static void main(String[] args) {
		for(int i=0;i<=1000;i++)
		{
//			find the digit
			int n=i;
			int temp1=n;
			int temp2=n;
			int digit = 0;
			int sum=0;
			while(n>0)
			{
				n=n/10;
				digit++;	
			}
			while(temp1>0)
			{
				int rem= temp1%10;
				int prod=1;
				int c=digit;
				while(c>0)
				{
					prod=prod*rem;
					c--;
				}
				sum = sum+prod;
				temp1=temp1/10;
			}
			if(sum==temp2)
			{
				System.out.println(sum);
			}
			
				
		}
	}

}
