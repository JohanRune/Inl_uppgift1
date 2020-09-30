/**
 * Created by Johan Rune
 * Date: 2020-09-26
 * Time: 16:09
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Orm extends Djur implements returneraVikt{
    public static final int foderVikt = 20; //inkapsling?

    public Orm (String namn, int vikt, Foder foder) { //konstruktor. Exempel på inkapsling.
        super (namn, vikt, foder);
    }

    public int returneraVikt(){
        return foderVikt;
    }
}