class abc
{
        void abcc(int a,int b)
	{
		System.out.println("Sum Is:"+(a+b));
	}

}
class xyz extends abc
{
	xyz(int a,int b)
	{	

		System.out.println("Sub Is:"+(a-b));
	}
}
class pqr
{
	public static void main(String args[])
	{
	
	        xyz x=new xyz(10,20);
		x.abcc(2,5);
	}
}