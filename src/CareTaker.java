
/**
 * @author Remy
 *
 */
import java.util.ArrayList;
import java.util.List;

public class CareTaker 
{
   public List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento forme){
      mementoList.add(forme);
   }

   public Memento get(int index){
      return mementoList.get(index);
   }
}