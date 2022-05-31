package eserciziopagina128n3;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author FraDan
 */
public class F1Class extends Thread{
    //fase dichiarativa
    double b=0;
    double y=0;
    double r3=0;
    
    //fase esecutiva

   public F1Class() 
   {
       super();
   }
   
   @Override
   public void run()
   {
   setName("R3");
   
    try {
            BufferedReader reader = new BufferedReader(new FileReader( "InserimentoB.txt"));
       
            b=Double.valueOf(reader.readLine());
        } catch (Exception eccezione) {
            System.out.print("ERRORE... valore di b non valido");
        }
    
    try {
            BufferedReader reader = new BufferedReader(new FileReader( "InserimentoY.txt"));
       
            y=Double.valueOf(reader.readLine());
        } catch (Exception eccezione) {
            System.out.print("ERRORE... valore di y non valido");
        }
    
    r3 = 7*b*y;
   }
   
   //rendiamo pubblica per tutte le classi del programma la variabile r2
   public double getR3(){
        return r3;
    }
}