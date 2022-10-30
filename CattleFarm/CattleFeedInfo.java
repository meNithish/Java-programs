package cattle_farm;

public class CattleFeedInfo 
{
	private date PurchaseDate;
	private double Quantity,price;
	private String TypeOfFeed;
	
	public CattleFeedInfo (date PurchaseDate,double Quantity,double price,String TypeOfFeed)
	{
		this.price=price;
		this.PurchaseDate=PurchaseDate;
		this.Quantity=Quantity;
		this.TypeOfFeed=TypeOfFeed;
	}

	public date PurchaseDate() {
		return PurchaseDate;
	}

	public double Quantity() {
		return Quantity;
	}

	public double price() {
		return price;
	}

	public String TypeOfFeed() {
		return TypeOfFeed;
	}
	

}
