/**
 * 
 */

/**
 * @author Remy
 *
 */

public class Coureur 
{

	/**
	 * @param args
	 */
	private int idCoureur;
	private String nomCoureur;
	private int va;
	private int sp;
	private int mt;

	private Equipe eq = null;
	
	public int forme; 
	public int crev = 0;
	public int chute = 0;
	public boolean abandon = false;
	
	private static int DEFAULT_ID = 0;
	
	
	// Constructeurs
	public Coureur()
	{
		this.idCoureur = DEFAULT_ID;
		DEFAULT_ID++;
		this.nomCoureur = "C"+idCoureur;
		this.va = -1;
		this.sp = -1;
		this.mt = -1;
	}
	
	public Coureur(String nomCoureur, int sp, int va, int mt)
	{
		this.idCoureur = DEFAULT_ID;
		this.nomCoureur = nomCoureur;
		this.va = va;
		this.sp = sp;
		this.mt = mt;
		DEFAULT_ID++;
	}
	
	
	// Accesseurs
	public int getIdCoureur()
	{
		return this.idCoureur;
	}
	
	public String getNomCoureur()
	{
		return this.nomCoureur;
	}
	
	public int getVa()
	{
		return this.va;
	}
	
	public int getSp()
	{
		return this.sp;
	}
	
	public int getMt()
	{
		return this.mt;
	}
	
	public Equipe getEq()
	{
		return this.eq;
	}
	
	
	
	// Mutateurs 
	public void setNomCoureur(String nomCoureur)
	{
		this.nomCoureur = nomCoureur;
	}
	
	public void setIdCoureur(int id)
	{
		this.idCoureur = id;
	}

	
	public void setVa(int va)
	{
		this.va = va;
	}
	
	public void setMt(int mt)
	{
		this.mt = mt;
	}
	
	public void setSp(int sp)
	{
		this.sp = sp;
	}

	public void setEquipe(Equipe e)
	{
		this.eq = e;
	}
	
	public void getStatus()
	{
		String str="";
		str += this.nomCoureur + " a subi " + this.crev + " crevaison(s), " + this.chute + " chute(s).";
		if(abandon)
		{
			str += " Il a été contraint d'abandonner.";
		}
		System.out.println(str);
	}
	
	public void reset()
	{
		this.chute = 0;
		this.crev = 0;
		this.abandon = false;
	}
	
	// toString()
	public String toString()
	{
		String str = "";
		
		str += this.nomCoureur + "! ";
		str += "Equipe " + this.eq + " | ";
		str += "Grimpeur " + this.mt + " | ";
		str += "Sprinteur: " + this.sp + " | ";
		str += "Puncheur " + this.va;
		return str;	
	}
	
}
