package Foot_Ball_Player;

public class FieldPlayer extends Human 
{
	private int goalcount;
	
	public FieldPlayer(String name,int count,int id,int goalcount)
	{
		this.count=count;
		this.goalcount=goalcount;
		this.id=id;
		Name=name;
	}

	public int goalcount() {
		return goalcount;
	}
	
	

}
