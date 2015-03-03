/**
 * 
 */

/**
 * @author Remy
 *
 */
public class Memento 
{
	public int forme; 
	public String nomCoureur;
	public String nomCourse;
	
	public Memento(int f, String nomCoureur, String nomCourse)
	{
		this.forme = f;
		this.nomCoureur = nomCoureur; 
		this.nomCourse = nomCourse; 
	}
		
	public int getState()
	{
		return this.forme;
	}
	
	public String getCoureur()
	{
		return this.nomCoureur;
	}	
	
	public String getCourse()
	{
		return this.nomCourse;
	}
	

}
