import fruit.*;                                         //connectties tussen de classes worden gemaat met de Main.java
import drinken.metprik.Cola;
import drinken.Water;
import groente.*;
import snacks.*;

public class Main {

    public static void main(String[] args) {

        Water w = new Water();                              //alles word gedefineert
        Cola c = new Cola();
        Appels a = new Appels();
        Druiven d = new Druiven();
        Watermeloen wm = new Watermeloen();
        Ijsbergsla i = new Ijsbergsla();
        Komkommer k = new Komkommer();
        Wortel wr = new Wortel();
        Chips ch = new Chips();
        Chocolade cho = new Chocolade();

        w.setKleur("Transparant");                      //alles wordt de kleur voor gezet
        c.setKleur("Zwart");
        a.setKleur("Groen");
        d.setKleur("Zwart");
        wm.setKleur("Rood");
        i.setKleur("Groen");
        k.setKleur("Groen");
        wr.setKleur("Oranje");
        ch.setKleur("Geel");
        cho.setKleur("Bruin");

        w.setName("Spa");                               //alles wordt de naam van gezet
        c.setName("Coca-Cola");
        a.setName("Granny Smith");
        d.setName("Druiven");
        wm.setName("Watermeloen");
        i.setName("Sla");
        k.setName("Komkommer");
        wr.setName("Wortel");
        ch.setName("Lays");
        cho.setName("Milka");

        //alle informatie wordt in een println gedaan
        System.out.println("Koelkast vooraad:\n"+ w.getName() +", de kleur: " + w.getKleur()+  "\n"+ c.getName() +", de kleur: " + c.getKleur()+ "\n"+ a.getName() +", de kleur: " + a.getKleur()+ "\n"+ d.getName() +", de kleur: " + d.getKleur()+ "\n"+ wm.getName() +", de kleur: " + wm.getKleur()+"\n"+ i.getName() +", de kleur: " + i.getKleur()+"\n"+ k.getName() +", de kleur: " + k.getKleur()+"\n"+ wr.getName() +", de kleur: " + wr.getKleur()+"\n"+ ch.getName() +", de kleur: " + ch.getKleur()+"\n"+ cho.getName() +", de kleur: " + cho.getKleur()+"\n");



    }
}
