package eserciziopagina128n2;

import java.io.*;

/**
 *
 * @author FraDan
 */
public class EsercizioPagina128N2 {
    public static void main(String[] args) throws InterruptedException {
        //fase dichiarativa
        
        
        double a=0;
        double r1=0;
        double r4=0;
        long inizio=System.currentTimeMillis();
        
        F1Class f1 = new F1Class();
        F2Class f2 = new F2Class();
        //fase esecutiva
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader( "InserimentoA.txt"));
       
            a=Double.valueOf(reader.readLine());
        } catch (Exception eccezione) {
            System.out.print("ERRORE... valore di a non valido");
        }

        r1=3+2*a;
        
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
        
        f2.start();
        
        try{
            f2.join();
        }catch(Exception eccezione)
        {
            System.out.println("ERRORE nella fork2");
        }
        
        r4=r1*f1.getR2()+f2.getR3();
        long fine=System.currentTimeMillis();
        long tempo = fine-inizio;
        System.out.println("Il tempo di esecuzione del programma è: "+tempo+" millisecondi");
    }
    
}
