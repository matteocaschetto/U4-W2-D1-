package ES2;

import java.util.Scanner;


public class CalcoloKmLitro {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Inserisci il numero di km percorsi: ");
         int km = Integer.parseInt(scanner.nextLine());



        
        System.out.print("Inserisci i litri di carburante consumati: ");
        int litri = Integer.parseInt(scanner.nextLine());

        try {
            
            if (litri == 0) {
                throw new ArithmeticException("Errore: Divisione per zero, i litri non possono essere zero.");
            }

            double kmPerLitro = (double) km / litri;

            
            System.out.println("Il consumo è di " + kmPerLitro + " km/litro.");

        } catch (ArithmeticException e) {
            
            System.out.println("Errore: " + e.getMessage());
        } catch (Exception e) {
            
            System.out.println("Errore imprevisto: " + e.getMessage());
        } finally {
           
            scanner.close();
        }
    }
}

