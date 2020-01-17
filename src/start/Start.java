
package start;

import java.util.ArrayList;

public class Start {


    public static void main(String[] args)
    {
       ArrayList<Punkt> dane1 = Generator.generujSzereg(48);
       Dane sz = new Szereg(dane1);
       ArrayList<Punkt> list = sz.getDane();
       
       Statystyka st = new Statystyka();
       double sr = st.srednia(sz);

       st.dominanta(sz);
       
       st.mediana(sz);
       
       st.dominanta(sz);
       
    }
    
}
