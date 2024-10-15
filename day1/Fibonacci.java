package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x= 0;
int y = 1;
int range = 8;
int z;
System.out.println(" "+x +"\n " + y);
		for(int i=2;i<range;++i)
		{
			z= x+y;
			System.out.println(" "+z);
			x=y;
			y=z;
			
		}
		
		
	}

}
