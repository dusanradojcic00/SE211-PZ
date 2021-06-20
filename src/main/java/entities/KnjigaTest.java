package entities;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class KnjigaTest {

    @org.junit.Test
    public void izracunajProsek() {
        Knjiga k = new Knjiga();
        Recenzija r1 = new Recenzija();
        r1.setOcena(5);
        Recenzija r2 = new Recenzija();
        r2.setOcena(5);
        Recenzija r3 = new Recenzija();
        r3.setOcena(3);
        Recenzija r4 = new Recenzija();
        r4.setOcena(3);
        List<Recenzija> lista = new ArrayList<>();
        lista.add(r1);
        lista.add(r2);
        lista.add(r3);
        lista.add(r4);
        k.setRecenzije(lista);
        k.izracunajProsek();
        assertEquals(k.getOcena(), 4.0, 0.1);
    }
}