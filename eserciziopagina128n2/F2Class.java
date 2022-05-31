package eserciziopagina128n2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author FraDan
 */
public class F2Class extends Thread{
    //fase dichiarativa
    double c=0;
    double r3=0;
    
    //fase esecutiva

   public F2Class() 
   {
       super();
   }
   
   @Override
   public void run()
   {
   setName("R3");
   
    try {
            BufferedReader reader = new BufferedReader(new FileReader( "InserimentoC.txt"));
       
            c=Double.valueOf(reader.readLine());
        } catch (Exception eccezione) {
            System.out.print("ERRORE... valore di b non valido");
        }
    
    r3 = 8-3*c;
   }
   
   //rendiamo pubblica per tutte le classi del programma la variabile r2
   public double getR3(){
        return r3;
    }
}