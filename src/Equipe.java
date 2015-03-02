import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Remy
 *
 */
public class Equipe 
{
	
	private int idE;
	private String nomE;
	private ArrayList <Coureur> listC;
	private Sponsor sponsor;  
	
	
	// Constructeurs 
	public Equipe()
	{
		this.nomE = "vide";
	}
	
	public Equipe(String nomE)
	{
		this.nomE = nomE;
	}
	
	
	// Accesseurs 
	public String getNomE()
	{
		return this.nomE;
	}
	
	public ArrayList<Coureur> getlistC()
	{
		return this.listC;
	}
	
	public Sponsor getSponsor()
	{
		return this.sponsor;
	}
	
	
	// Mutateurs
	public void addCoureur(Coureur c)
	{
		if(c.getEq() == null)
		{
			this.listC = new ArrayList<Coureur>();
			this.listC.add(c);
		}
		c.setEquipe(this);
	}
	
	public void setSponsor(Sponsor s) 
	{
		this.sponsor = s;
	}
	
	public void setNom(String nom) 
	{
		this.nomE = nom;
	}
	

	// toString()
	public String toString()
	{
		String str = "";
		str +=  this.nomE + " (" + this.sponsor + ")";
		return str;
	}
	
	
}
