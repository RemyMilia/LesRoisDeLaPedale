/**
 * 
 */

/**
 * @author Remy
 *
 */
public class Originator 
{
   private int forme;
   private String nomCoureur;
   private String nomCourse;

   public void setForme(int f){
      this.forme = f;
   }
   public void setCoureur(String coureur){
	      this.nomCoureur = coureur;
	   }
   public void setCourse(String course){
	      this.nomCourse = course;
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

   public Memento saveFormeToMemento(){
      return new Memento(forme,nomCoureur,nomCourse);
   }

   public void getFormeFromMemento(Memento Memento){
      forme = Memento.getState();
      nomCoureur = Memento.getCoureur();
      nomCourse = Memento.getCourse();
   }
}