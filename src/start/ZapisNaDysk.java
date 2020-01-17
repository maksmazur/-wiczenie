
package start;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class ZapisNaDysk implements ZapisStatystyka, ZapisDane 
{
    public void zapisz(String text) throws FileNotFoundException
    {
        PrintWriter plik = new PrintWriter("wynik.txt");
        plik.println(text);
        plik.close();
    }
 }
    
    
