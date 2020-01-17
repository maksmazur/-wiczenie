
package start;

import java.util.ArrayList;
import java.util.Random;

public class Generator 
{
   static ArrayList<Punkt> generujSzereg(int liczbaPunktow)
   {
       ArrayList<Punkt> lista = new ArrayList<Punkt>();
       
       Random random = new Random();
       
       for(int i=0; i<liczbaPunktow; i++)
       {
           
           Punkt punkt = new Punkt();
           punkt.setX(random.nextInt());
           lista.add(punkt);
       }
       return lista;
   }
}
