package inheritance;

public class Animal {
	int age;
	String gender;
	int weight;
	int legs = 4;


public Animal(int age, String gender, int weight)
{
	this.age= age;
	this.gender= gender;
	this.weight= weight;
}
public void eat()
{
	System.out.println("eating");
}

//function
//getLegsCount -- return 4;

/*  
public void legs()
{
	if(legs == 4)
	{
		System.out.println("can swim");
	}
	else
	{
		System.out.println("cant swim");
	}
}
*/
//function
//canSwim -- getLegsCount if 4 yes.
public void sleep()
{
System.out.println("sleeping");	

}
}