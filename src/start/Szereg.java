
package start;

import java.util.ArrayList;

public class Szereg implements Dane
{
  private String nazwaSzeregu;  
  private ArrayList<Punkt> szereg;
  
  public Szereg()
  {
    szereg = new ArrayList<Punkt>();
  }
 
  public Szereg(ArrayList<Punkt> szereg)
  {
      this.szereg = szereg;
  }
  
  @Override
  public ArrayList<Punkt> getDane() 
  {
  return this.szereg;    
  }
  
  
}
