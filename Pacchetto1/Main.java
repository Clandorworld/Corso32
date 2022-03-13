package Pacchetto1;
import Pacchetto2.*;

public class Main {

    // I modificatori di accesso (le parole a inizio Classe)
    // servono per aggiungere un livello di sicurezza aggiuntivo

    //                  Class   package     subClass    world
    // public           si      si          si          si
    // protected        si      si          si          no* (si, se è in una SubClass)
    // default          si      si          no          no
    // private          si      no          no          no

   /* public static void main(String[] args) {

        B prova = new B();
        System.out.println(prova.nome);
        NON MI RICONOSCE "NOME" DELLA CLASSE "B", PERCHE' ESSENDO DI DEFAULT NON PUO'
        ESSERE UTILIZZATO IN SUBCLASS E PACCHETTI ESTERNI (WORLD)
    */
   public static void main(String[] args) {
       B prova2 = new B();
       System.out.println(prova2.cognome);

       A prova3 = new A();
       System.out.println(prova3.eta);
       //Posso usare "cognome" perchè in "B" è "public"
       //Posso usare "eta" perchè in "A" è "protected", quindi si, visto che è nello stesso Pacchetto
   }
}
