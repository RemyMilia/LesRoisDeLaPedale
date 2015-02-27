/**
 * 
 */

/**
 * @author Remy
 *
 */
public class Coureur {

	/**
	 * @param args
	 */
	private int idCoureur;
	private String nomCoureur;
	private int va;
	private int sp;
	private int mt;
	private Equipe eq;
	
	public Coureur(int idCoureur, int va, int sp, int mt, Equipe eq)
	{
		this.idCoureur = idCoureur;
		this.nomCoureur = "C"+idCoureur;
		this.va = va;
		this.sp = sp;
		this.mt = mt;
		this.eq = eq;
	}
	
	public int getIdCoureur(){
		return this.idCoureur;
	}
	
	public String getNomCoureur(){
		return this.nomCoureur;
	}
	
	public int getVa(){
		return this.va;
	}
	
	public int getSp(){
		return this.sp;
	}
	
	public int getMt(){
		return this.mt;
	}
	
	public Equipe getEq(){
		return this.eq;
	}
	
}
