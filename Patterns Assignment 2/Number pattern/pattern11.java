class pattern11
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
	for(int k=4;k>=i;k--)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	for(int k1=2;k1<=i;k1++)
	{
		System.out.print("*");
	}
	System.out.println();

}
}
}