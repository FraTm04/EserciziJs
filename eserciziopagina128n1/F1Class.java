package eserciziopagina128n1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author FraDan
 */
public class F1Class extends Thread{
    //fase dichiarativa
    double b=0;
    double r2=0;
    
    //fase esecutiva

   public F1Class() 
   {
       super();
   }
   
   @Override
   public void run()
   {
   setName("R2");
   
    try {
            BufferedReader reader = new BufferedReader(new FileReader( "InserimentoB.txt"));
       
            b=Double.valueOf(reader.readLine());
        } catch (Exception eccezione) {
            System.out.print("ERRORE... valore di b non valido");
        }
    
    r2 = 7*b+3;
   }
   
   //rendiamo pubblica per tutte le classi del programma la variabile r2
   public double getR2(){
        return r2;
    }
}