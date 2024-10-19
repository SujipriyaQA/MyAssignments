package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 17, count =0;

if(num<2)
{
	System.out.println("The given number is not prime");
}

for(int i = 1; i<=num; i++)
{
	if (num%i==0)
	{
		//System.out.println(count);
		count= count + 1;
		//System.out.println(count);
	}
}
	if(count==2)
	{
		System.out.println("The given num is a prime");
	}
		
	else {
		System.out.println("It is not Prime");
	}
	}

}
