package week1.day2;

public class FindOddNumbers {
public static void main(String[] args) {
	short maxRange=10;
	System.out.println("The Odd Number are");
			for (int i = 0; i <= maxRange; i++) {
				if((i/2==3)&&(i%2==1))
				{
					System.out.println("this is continue if"); 
					continue; 
				}
				if(i%2==1)
				{
					System.out.println(i);
				}
				
			}
		
}
}
