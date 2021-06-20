package entities;

import java.util.Date;

public class Autor extends Osoba {
    private Date datumRodjenja;

    public Autor() {
    }

    public Autor(String ime, String prezime) {
        super(ime, prezime);
    }

    public Autor(String ime, String prezime, Date datumRodjenja) {
        super(ime, prezime);
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
