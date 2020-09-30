/**
 * Created by Johan Rune
 * Date: 2020-09-26
 * Time: 16:09
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Katt extends Djur implements returneraVikt{

    public Katt (String namn, int vikt, Foder foder) { //konstruktor. Exempel på inkapsling.
        super (namn, vikt, foder);
    }

    public int returneraVikt(){
        return this.getVikt()*1000/150;
    }

}
