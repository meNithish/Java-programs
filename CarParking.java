package airport_car_parking;
enum MemberType
{
	NormalVisitor,
	SpecialVisitor
};

public class CarParking 
{
	private String CarId,CarNo;
	private int EntryTimeHours,EntryTimeMins,ExitTimeHours,ExitTimeMins;
    private double ParkingCharge=0.0;
    private MemberType t;
    
    public CarParking(String CarId,String CarNo,int EntryTimeHours,int EntryTimeMins,int ExitTimeHours,int ExitTimeMins, MemberType t)
    {
    	this.CarId=CarId;
    	this.CarNo=CarNo;
    	this.EntryTimeHours=EntryTimeHours;
    	this.EntryTimeMins=EntryTimeMins;
    	this.ExitTimeHours=ExitTimeHours;
    	this.ExitTimeMins=ExitTimeMins;
    	this.t=t;
    	
    }
    
    
    public double CalculateParkingCharge(int EntryTimeHours,int EntryTimeMins,int ExitTimeHours,int ExitTimeMins,MemberType mt)
    {
    	int tt;
    	int entry=(EntryTimeHours*60)+EntryTimeMins;
    	int exit=(ExitTimeHours*60)+ExitTimeMins;
    	if(entry>exit)
    	{
    		 tt= exit-entry+(24*60);
    	}
    	
    	else 
    	{
       	    tt= exit-entry;
       	}
    	
    	
    	if(mt==MemberType.NormalVisitor) 
    	{
    	 if(tt>10&&tt<=30)
    	  {
    		tt=50;
    		ParkingCharge=80;
    	  }
    	 else if(tt>30&&tt<=720)
    	  {
    		 ParkingCharge=80;
    	  }
    	else if(tt>720&&tt<=1440)
    	 {
    		ParkingCharge=120;
    	 }
    	else if(tt>1440)
    	 {
    		ParkingCharge=150;
    	 }
    	 return ParkingCharge();
       }
    	else
    	{
    		if(tt==30)
      	  {
      		tt=30;
      		ParkingCharge=45;
      	  }
      	 else if(tt>30&&tt<=720)
      	  {
      		ParkingCharge=60;
      	  }
      	else if(tt>720&&tt<=1440)
      	 {
      		ParkingCharge=90;
      	 }
      	else if(tt>1440)
      	 {
      		ParkingCharge=120;
      	 }
    		return ParkingCharge();
    		
    	}
    	


    }


	public String CarId() {
		return CarId;
	}


	public String CarNo() {
		return CarNo;
	}


	public int EntryTimeHours() {
		return EntryTimeHours;
	}


	public int EntryTimeMins() {
		return EntryTimeMins;
	}


	public int ExitTimeHours() {
		return ExitTimeHours;
	}


	public int ExitTimeMins() {
		return ExitTimeMins;
	}


	public MemberType t() {
		return t;
	}


	public double ParkingCharge() {
		return ParkingCharge;
	}
}
