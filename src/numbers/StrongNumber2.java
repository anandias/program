package numbers;

public class StrongNumber2 {
	public static void main(String[] args) {
//		1!+4!+5!=145
		int n=145;
		int temp = n;
		int sum = 0;
		int rem=0;
		
		while(n>0)
		{
			rem=n%10;
			int prod=1;
			while(rem>0)
			{
				prod= prod*rem;
				rem--;
			}
			sum=sum+prod;
			n=n/10;
				
		}
		if(sum==temp)
		{
			System.out.println("strong");
		}
		else
		{
			System.out.println("no");
		}
			
	}

}
