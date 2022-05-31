package eserciziopagina128n1;

import java.io.*;

/**
 *
 * @author FraDan
 */
public class EsercizioPagina128N1 {
    public static void main(String[] args) throws InterruptedException {
        //fase dichiarativa
        
        
        double a=0;
        double r1=0;
        double r3=0;
        double c=0;
        double r4=0;
        long inizio=System.currentTimeMillis();
        
        F1Class f1 = new F1Class();
        //fase esecutiva
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader( "InserimentoA.txt"));
       
            a=Double.valueOf(reader.readLine());
        } catch (Exception eccezione) {
            System.out.print("ERRORE... valore di a non valido");
        }
	
       r1=2*a+4;
        
        
        /*
        mandiamo in esecuzione i Thread per il calcolo e l'assegnazione in input
        */
        
        /*con start eseguiamo il Thread
        con join interrompianto il Thread
        */
        
        f1.start();
        
        try{
            f1.join();
        }catch(Exception eccezione)
        {
            System.out.println("ERRORE nella fork1");
        }
        
        r3=r1*f1.getR2();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader( "InserimentoC.txt"));
       
            c=Double.valueOf(reader.readLine());
        } catch (Exception eccezione) {
            System.out.print("ERRORE... valore di c non valido");
        }
        
        r4=5*r3-10*c;
        
        long fine=System.currentTimeMillis();
        long tempo = fine-inizio;
        System.out.println("Il tempo di esecuzione del programma è: "+tempo+" millisecondi");
    }
    
}
