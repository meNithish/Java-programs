package cattle_farm;
enum CattleType
{
	Cow,
	Ox,
	Buffalo
};
public class CattleInfo 
{
	String CattleName, CattleID;
	CattleType Type;
	CattleInsurance Insurance;
	CattleVaccination Vaccine;
	CattleFeedInfo feed;
	
	public CattleInfo(String CattleName,String CattleID,CattleType Type,CattleInsurance Insurance,CattleVaccination Vaccine,CattleFeedInfo feed)
	{
		this.CattleID=CattleID;
		this.CattleName=CattleName;
		this.feed=feed;
		this.Insurance=Insurance;
		this.Type=Type;
		this.Vaccine=Vaccine;
	}

}
