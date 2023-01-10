package p1;
public class StringNoForLoop {
	public static void main(String[] args) {
		for(int j=0;j<500;j++)
		
		
		{
			int n=j;
			int sum=0;
			int i=1;
		
			if(n%2==0)
			{
			while(i<=n/2)
			{   
				if(n%i==0)
				{
					sum=sum+i;
					
				}
				i++;
			}
			}
			if(sum==n)
				System.out.println(n+" is a strong number");
		}
		
	}

}
