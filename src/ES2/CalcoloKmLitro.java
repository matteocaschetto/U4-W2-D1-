package ES2;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalcoloKmLitro {

    private static final Logger logger = LoggerFactory.getLogger(CalcoloKmLitro.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Inserisci il numero di km percorsi: ");
        double km = scanner.nextDouble();

        
        System.out.print("Inserisci i litri di carburante consumati: ");
        double litri = scanner.nextDouble();

        try {
            
            if (litri == 0) {
                throw new ArithmeticException("Errore: Divisione per zero, i litri non possono essere zero.");
            }

            double kmPerLitro = km / litri;

            
            System.out.println("Il consumo è di " + kmPerLitro + " km/litro.");

        } catch (ArithmeticException e) {
            
            logger.error(e.getMessage());
            System.out.println("Errore: " + e.getMessage());
        } catch (Exception e) {
            
            logger.error("Errore imprevisto: " + e.getMessage());
            System.out.println("Errore imprevisto: " + e.getMessage());
        } finally {
           
            scanner.close();
            logger.info("Programma terminato.");
        }
    }
}

