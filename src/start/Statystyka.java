
package start;
import java.util.ArrayList;
import java.util.Arrays;

public class Statystyka 
{
    
    float [] opisDanych = new float [4]; // tworzenie tablicy  z 4 elementami
    
    
    public Statystyka (){
        
        
    }
       
    
    void mediana (Dane d){
    
       
       
       
        
        
    }
    
    void dominanta (Dane d){
        
    }
    
    // odwołanie się do obiektu dane gdzie są wprowadzane liczny
    double srednia(Dane d) {
        if (d == null) {
            // zakładamy, że lista jest jak lista pusta
            return 0.0;
        }
        int suma = 0;
        int ilosc = d.getDane().size();
        
        if (ilosc == 0) {
            return 0.0;
        }
        for (Punkt p : d.getDane()) {
            // zakładamy ze nikt nie wprowadzi nam nulla do dancych
            if (p != null)  {
                suma += p.getX();
            }
        }
        
        double wynik = suma / ilosc;
        return wynik;
    }
    
   
    void odchylenie(Dane d){
        
    }
    
    public void test(){
        Szereg szeregZDanymi = new Szereg (Generator.generujSzereg(20));
        Statystyka stata = new Statystyka();
        
        
        System.out.println("Opis danych"+ stata.opisDanych[0]+ stata.opisDanych[1]+stata.opisDanych[2]+stata.opisDanych[3]);
        
    }
    
    private void srednia(Szereg szeregZDanymi){
        throw new UnsupportedOperationException("Not supportet yet"); 
    }
}


