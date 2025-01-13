package ES1;


import java.util.Random;
import java.util.Scanner;

public class GestioneErroriArray {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }


        System.out.println("Array iniziale:");
        stampaArray(array);

        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {

                System.out.print("Inserisci l'indice dell'array (0 per terminare): ");
                int indice = scanner.nextInt();


                if (indice == 0) {
                    break;
                }


                if (indice < 0 || indice >= array.length) {
                    throw new ArrayIndexOutOfBoundsException("Indice fuori dai limiti dell'array!");
                }


                System.out.print("Inserisci il nuovo valore per l'elemento in posizione " + indice + ": ");
                int nuovoValore = scanner.nextInt();


                array[indice] = nuovoValore;

                // Stampa l'array dopo l'aggiornamento
                System.out.println("Nuovo stato dell'array:");
                stampaArray(array);

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Errore: " + e.getMessage());
            } catch (Exception e) {

                System.out.println("Errore imprevisto: " + e.getMessage());
                scanner.nextLine();
            }
        }


        scanner.close();
        System.out.println("Programma terminato.");
    }


    private static void stampaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
