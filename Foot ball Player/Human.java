package Foot_Ball_Player;

public class Human 
{
	 String Name;
	 int count,id;
	
	public Human()
	{
		
	}
	
	public Human(String Name,int count,int id)
	{
		this.count=count;
		this.id=id;
		this.Name=Name;
	}

	public String Name() {
		return Name;
	}

	public int Count() {
		return count;
	}

	public int id() {
		return id;
	}
	
	

}
