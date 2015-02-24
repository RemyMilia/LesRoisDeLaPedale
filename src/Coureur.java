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
	private String nomCoureur;
	private int va;
	private int sp;
	private int mt;
	
	public Coureur(String nom, int va, int sp, int mt)
	{
		this.nomCoureur = nom;
		this.va = va;
		this.sp = sp;
		this.mt = mt;
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
	
}
