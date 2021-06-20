package entities;

import java.util.List;

public class Knjiga {
    private String isbn;
    private String naslov;
    private String opis;
    private double prosecnaOcena;
    private Autor autor;
    private List<Recenzija> recenzije;

    public Knjiga() {
    }

    public Knjiga(String isbn, String naslov, String opis) {
        this.isbn = isbn;
        this.naslov = naslov;
        this.opis = opis;
    }

    public Knjiga(String isbn, String naslov, String opis, double prosecnaOcena, Autor autor, List<Recenzija> recenzije) {
        this.isbn = isbn;
        this.naslov = naslov;
        this.opis = opis;
        this.prosecnaOcena = prosecnaOcena;
        this.autor = autor;
        this.recenzije = recenzije;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getProsecnaOcena() {
        return prosecnaOcena;
    }

    public void setProsecnaOcena(double prosecnaOcena) {
        this.prosecnaOcena = prosecnaOcena;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Recenzija> getRecenzije() {
        return recenzije;
    }

    public void setRecenzije(List<Recenzija> recenzije) {
        this.recenzije = recenzije;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
