/**
 * 
 */

/**
 * @author Remy
 *
 */
public class Course 
{
	
	private int idCourse;
	private String nomCourse;
	private int va; // Profil orienté vallons
	private int sp; // plaines - sprint
	private int mt; // montagneux
	private Coureur vainq;
	
	private static int DEFAULT_ID = 0;
	
	// Constructeurs 
	public Course()
	{
		this.idCourse = DEFAULT_ID;
		DEFAULT_ID++;
		this.nomCourse = "vide";
		this.va = -1;
		this.sp = -1;
		this.mt = -1;
	}
	
	public Course(int idCourse, String nomCourse, int sp, int va, int mt)
	{
		this.idCourse = idCourse;
		this.nomCourse = nomCourse;
		this.va = va;
		this.sp = sp;
		this.mt = mt;
	}
	
	// Accesseurs 
	public int getIdCourse()
	{
		return this.idCourse;
	}
	
	public String getNomCourse()
	{
		return this.nomCourse;
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
	
	public Coureur getVainqueur()
	{
		return this.vainq;
	}
	
	
	// Mutateurs 
	public void setVainqueur(Coureur vainq)
	{
		this.vainq = vainq;
	}
	
	public void setIdCourse(int id)
	{
		this.idCourse = id;
	}
	
	public void setNomCourse(String nomC)
	{
		this.nomCourse = nomC;
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
	
	// toString()
	public String toString()
	{
		String str = "";
		str += "Id " + this.idCourse + " " + this.nomCourse + " (" + "plaine:" + this.sp + "," + "vallons: " + this.va + ", montagne: " + this.mt + ")";
		return str;
	}
}
