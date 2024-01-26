package relationshipHas_a;

public class Engine {
	String type;
	int hp;
	int strokes;
Engine()
{
	
}
Engine(  String type ,int hp,int strokes)
{
	this .type= type;
	this.hp= hp;
	this.strokes= strokes;
}
public void displayEngine()
{
	System.out.println("Engine name is :" +type);
	System.out.println("Engine hp is :"+hp);
	System.out.println("Engine strokes is :"+ strokes);
}

}
