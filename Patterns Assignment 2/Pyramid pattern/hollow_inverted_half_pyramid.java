class hollow_inverted_half_pyramid
{
	public static void main(String args[])
	{
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==6||j==6||i==1||j==1||i==j)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
	}
}
}