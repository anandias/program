package numbers;

public class StrongNumber {
	public static void main(String[] args) {
		for(int i=0;i<=1000;i++)
		{
			int n= i;
			int temp=n;
			int sum =0;
			int rem=0;
			while(n>0)
			{
				rem=n%10;
				int prod=1;
				while(rem>0)
				{
					prod=prod*rem;
					rem--;
				}
				sum=sum+prod;
				n=n/10;
				
			}
			if(sum==temp)
			{
				System.out.println(sum);
			}
				
			
		}
	}

}
