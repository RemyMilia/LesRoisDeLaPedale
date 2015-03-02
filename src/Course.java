/**
 * 
 */

/**
 * @author Remy
 *
 */
public class Course {
	
	private int idCourse;
	private String nomCourse;
	private int va;
	private int sp;
	private int mt;
	private Coureur vainq;
	
	private static int DEFAULT_ID = 0;
	
	
	public Course()
	{
		this.idCourse = DEFAULT_ID;
		DEFAULT_ID++;
		this.nomCourse = "vide";
		this.va = -1;
		this.sp = -1;
		this.mt = -1;
	}
	
	public Course(int idCourse, String nomCourse, int va, int sp, int mt)
	{
		this.idCourse = idCourse;
		this.nomCourse = nomCourse;
		this.va = va;
		this.sp = sp;
		this.mt = mt;
	}
	
	public int getIdCourse()
	{
		return this.idCourse;
	}
	
	public String getNomCourse(){
		return this.nomCourse;
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
	
	public Coureur getVainqueur()
	{
		return this.vainq;
	}
	
	public void setVainqueur(Coureur vainq)
	{
		this.vainq = vainq;
	}

}
