package Dipendenti;

import static Dipendenti.Livello.*;

public class Dipendenti {
     private static double stipendioBase =1000;
     private int matricola;
     private double stipendio;
     private double importoOrarioStraordinario;
     private Livello livello;
     private Dipartimento dipartimento;


     public Dipendenti(int matricola, Dipartimento dipartimento){
         this.matricola = matricola;
         this.dipartimento=dipartimento;
         this.stipendio=this.stipendioBase;
         this.importoOrarioStraordinario=30;
         this.livello=OPERAIO;
     }

     public Dipendenti(int matricola,Dipartimento dipartimento, double stipendio,double straordinario,Livello livello){
         this.matricola = matricola;
         this.dipartimento=dipartimento;
         this.stipendio=stipendio;
         this.importoOrarioStraordinario=straordinario;
         this.livello=livello;
     }


    public int getMatricola() {
        return matricola;
    }

    public Livello getLivello() {
        return livello;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendenti{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public static void stampaDataDipendente(Dipendenti dipendente){

        System.out.println(dipendente);
    }

    public void promuovi (){


         switch (this.livello){
             case OPERAIO -> {this.livello= IMPIEGATO ; this.stipendio=this.stipendioBase *1.2;}
             case IMPIEGATO -> {this.livello = QUADRO;this.stipendio=this.stipendioBase *1.5;}
             case QUADRO -> {this.livello = DIRIGENTE;this.stipendio=this.stipendioBase *2;}
             case DIRIGENTE -> System.out.println("Il dipendente è già un dirigente!!!");
         }

    }

    public static double calcolaPaga(Dipendenti x){
         return x.stipendio;
    }
    public static double calcolaPaga(Dipendenti x, int num){
         return x.stipendio + (num * x.importoOrarioStraordinario);
    }
}
