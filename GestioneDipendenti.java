import Dipendenti.Dipendenti;

import static Dipendenti.Dipartimento.*;
import static Dipendenti.Livello.DIRIGENTE;
import static Dipendenti.Livello.IMPIEGATO;

public class GestioneDipendenti {
    public static void main(String[] args) {
//crea 4 dipendenti
        Dipendenti luca = new Dipendenti(1233, PRODUZIONE);
        Dipendenti mario = new Dipendenti(1555, PRODUZIONE);
        Dipendenti aldo = new Dipendenti(1245, AMMINISTRAZIONE, 1500, 40, IMPIEGATO);
        Dipendenti matteo = new Dipendenti(1245, VENDITE, 2000, 50, DIRIGENTE);
//promuovi un operaio e un amministratore
        mario.promuovi();
        aldo.promuovi();
//stampa tutti i dipendenti
        Dipendenti.stampaDataDipendente(luca);
        Dipendenti.stampaDataDipendente(mario);
        Dipendenti.stampaDataDipendente(aldo);
        Dipendenti.stampaDataDipendente(matteo);
// calcola la somma ti tutti gli studenti
        Dipendenti[] allDip = {luca, mario, aldo, matteo};

        double totale = 0;
        for (Dipendenti dip : allDip) {
            totale = totale + Dipendenti.calcolaPaga(dip, 5);
        }
        System.out.println("il totale stipendi dell'azienda è:  " + totale);


    }
}
