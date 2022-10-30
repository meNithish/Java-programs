package cattle_farm;

public class CattleInsurance 
{
	private date InsuranceDone,InsuranceDue;
	
	public CattleInsurance(date InsuranceDone,date InsuranceDue)
	{
		this.InsuranceDone=InsuranceDone;
		this.InsuranceDue=InsuranceDue;
	}

	public date InsuranceDone() {
		return InsuranceDone;
	}

	public date InsuranceDue() {
		return InsuranceDue;
	}

}
