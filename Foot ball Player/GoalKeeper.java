package Foot_Ball_Player;

public class GoalKeeper extends Human 
{
	
	private int Total_stopping_shots,stoprate;
	
	public GoalKeeper(String Name,int count,int id,int Total_stopping_shots)
	{
		this.count=count;
		this.Total_stopping_shots=Total_stopping_shots;
		this.id=id;
		this.Name=Name;
		this.stoprate=Total_stopping_shots/count;
	}

	public int Total_stopping_shots() {
		return Total_stopping_shots;
	}

	public int stoprate() {
		return stoprate;
	}

}
