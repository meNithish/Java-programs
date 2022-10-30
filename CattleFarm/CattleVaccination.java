package cattle_farm;
import java.util.*;
enum VaccinationType
{
	Nasal,
	Syringe
};

public class CattleVaccination 
{
	private date da;
	private double amount;
	private VaccinationType T;
	
	public CattleVaccination (date da,double amount,VaccinationType T)
	{
		this.amount=amount;
		this.da=da;
		this.T=T;
	}

	public date date() {
		return da;
	}

	public double amount() {
		return amount;
	}

	public VaccinationType T() {
		return T;
	}
	
	
	

}
