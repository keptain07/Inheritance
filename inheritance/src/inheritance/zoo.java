package inheritance;
import java.util.*;

public class zoo {

	public static void main(String[] args )
 	{
		Animal a1 = new Animal(5, "m", 15);
		a1.eat();
		
		bird b1 = new bird(20, "f", 20 );
		b1.sleep();
		b1.eat();
	} 
	
	/*
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please enter legs");
		int legs = keyboard.nextInt();
		
		
	}
	*/
	
	
}
