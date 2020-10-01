import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johan Rune,
 * Date: 2020-09-28
 * Time: 15:03
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Inlämningsuppgift1 {

    Inlämningsuppgift1() {

        Hund sixten = new Hund("Sixten", 5, Foder.HUNDFODER);
        Hund dogge = new Hund("Dogge", 10, Foder.HUNDFODER);
        Katt venus = new Katt("Venus", 5, Foder.KATTFODER);
        Katt ove = new Katt("Ove", 3, Foder.KATTFODER);
        Orm hypno = new Orm("Hypno", 1, Foder.ORMFODER);

        List<returneraVikt> returneraFoderVikt = new ArrayList<>();
        returneraFoderVikt.add(sixten);
        returneraFoderVikt.add(dogge);
        returneraFoderVikt.add(venus);
        returneraFoderVikt.add(ove);
        returneraFoderVikt.add(hypno);

        String namn = JOptionPane.showInputDialog("Vilket djur ska få mat?");
        boolean harHittat = false;
        boolean loop = true;
        while (loop == true) {
            for (returneraVikt r : returneraFoderVikt)
                if (namn.toLowerCase().equals(r.getNamn().toLowerCase())) {
                    JOptionPane.showMessageDialog(null, (r.getNamn() + //r.fåNamn() är ett exempel på polymorfism
                            " ska få " + r.returneraVikt() + " gram " + r.getFoder().toString().toLowerCase())); //r.returneraVikt() är ett till exempel på polymorfism.
                    loop = false;
                    harHittat = true;
                }
            if (harHittat == false)
                namn = JOptionPane.showInputDialog("Du har angett ett namn som inte finns. Försök igen!");
        }
    }

    public static void main(String[] args) {
        Inlämningsuppgift1 inl1 = new Inlämningsuppgift1();
    }
}