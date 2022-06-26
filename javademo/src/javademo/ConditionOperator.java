package javademo;

public class ConditionOperator {

	public static void main(String[] args) 
	{
		int A=5;
		int B=6;
		if(!(A<B)||(A==B))
		{
		System.out.println("condition is true");
		}
		else
		{
			System.out.println("condition is false");
		}
		int AgeOfBoy=22;
		int AgeOfGirl=16;
		if((AgeOfBoy>=21)&&(AgeOfGirl>=18))
		{
		System.out.println("ready to get married!");	
		}
		else
		{
			System.out.println("wait for it kiddo!");
		}
	}

}
