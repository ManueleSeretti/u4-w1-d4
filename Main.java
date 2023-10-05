
import Dipendenti.Dipendenti;

import static Dipendenti.Dipartimento.PRODUZIONE;

public class Main {
    public static void main(String[] args) {

        Dipendenti luca=new Dipendenti(1233, PRODUZIONE);

        Dipendenti.stampaDataDipendente(luca);

        luca.promuovi();

        Dipendenti.stampaDataDipendente(luca);

        System.out.println("lo stipendio del dipendente è:  "+Dipendenti.calcolaPaga(luca));
        System.out.println("lo stipendio del dipendente è:  "+Dipendenti.calcolaPaga(luca,5));
    }
}
