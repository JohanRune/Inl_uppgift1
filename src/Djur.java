/**
 * Created by Johan Rune
 * Date: 2020-09-26
 * Time: 16:08
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public abstract class Djur implements returneraVikt{
    private int vikt; //inkapsling
    private String namn; //inkapsling
    private Foder foder;

    public Djur (String namn, int vikt, Foder foder) { //konstruktor. Exempel på inkapsling.
        this.namn = namn;
        this.vikt = vikt;
        this.foder = foder;
    }

    public int getVikt() {    //inkapsling
        return vikt;
    }

    public String getNamn() {    //inkapsling.
        return namn;
    }

    public Foder getFoder() { //inkapsling
        return foder;
    }
}
