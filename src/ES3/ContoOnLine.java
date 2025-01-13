package ES3;

public class ContoOnLine extends ContoCorrente {

    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public ContoOnLine(String matteoCaschetto, int saldo) {
        super();
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }

        if (x > maxPrelievo){
            throw new BancaException("il prelievo non è disponibile");
        }
    }
}
