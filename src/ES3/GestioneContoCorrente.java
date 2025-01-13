package ES3;

public class GestioneContoCorrente {
    private static String e;

    public static void main (String[] args){
        ContoCorrente cc = new ContoCorrente("Mario Rossi", 100);
        try{
            cc.preleva(50);
            System.out.println("Il saldo residuo è" + cc.restituisciSaldo());
        }catch (BancaException){
            
            throw new RuntimeException(e);
        } catch (BancaException e) {
            throw new RuntimeException(e);
        }
        new ContoOnLine("Matteo Caschetto", 1000);
    }
}
