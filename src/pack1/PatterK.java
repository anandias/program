package pack1;
public class PatterK {
	public static void main(String[] args) {
		int n=7;
		char ch='*';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0&&j==1||i==0&&j==2||i==1&&j==3||i==2&&j==1||i==2&&j==2)
				{
					System.out.print(ch+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}

}
