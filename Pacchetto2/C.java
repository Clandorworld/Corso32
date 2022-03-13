package Pacchetto2;
import Pacchetto1.*; //la "*" si riferisce a tutto il Pacchietto1

public class C extends A {

    public static void main(String[] args) {

        B prova = new B();
        System.out.println(prova.nome);
        /*
       POSSO RICHIAMARE IL NOME DI "B", DIFFERENTEMENTE DAL "MAIN" PERCHE' ESSENDO DI DEFAULT PUO'
        ESSERE UTILIZZATO IN CLASS E IN PACCHETTI INTERNI
    */
        C prova3 = new C();
        System.out.println(prova3.eta);
        //POSSO USARE "eta" PERCHE' è IN CLASSE "A" E PROTECTED (QUINDI IN ALTRe SUBCLASS VA BENE, ANCHE SE
        // FUORI DAL PACCHETTO)
    }
}
