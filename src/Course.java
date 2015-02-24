/**
 * 
 */

/**
 * @author Remy
 *
 */
public class Course {
	
	private String nomCourse;
	private int va;
	private int sp;
	private int mt;
	
	public Course(String nomCourse, int va, int sp, int mt)
	{
		this.nomCourse = nomCourse;
		this.va = va;
		this.sp = sp;
		this.mt = mt;
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

}
