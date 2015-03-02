/**
 * 
 */

/**
 * @author Remy
 *
 */
public class Sponsor 
{
	private String nomS; 
	private int budget;
	
	// Constructeurs 
	public Sponsor(String nomS, int budget)
	{
		this.nomS = nomS;
		this.budget = budget;
	}
	
	// Accesseurs
	public String getNomS()
	{
		return this.nomS;
	}
	
	public int getBudget()
	{
		return this.budget;
	}
	
	// Mutateurs 
	public void setNomS(String nomS)
	{
		this.nomS = nomS;
	}
	
	public void setBudget(int budget)
	{
		this.budget = budget;
	}
	
	// toString()
	public String toString()
	{
		String str = "";
		str +=  this.nomS + " au budget de " + this.budget;
		return str;
	}

}
