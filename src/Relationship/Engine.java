package Relationship;

public class Engine {
	String type;
	int hp;
	int strokes;
	Engine()
	{
		
	}
	Engine(String type,int hp,int strokes)
	{
		this.type=type;
		this.hp=hp;
		this.strokes=strokes;

	}
	public void display()
	{
		System.out.println( "The Engine type of car is :"+type);
		System.out.println( "The hp of car is :"+hp);
		System.out.println( "The Strokes of car is :"+strokes);

	}

}
