package entities;

public class Recenzija {
    private String naslov;
    private String opis;
    private double ocena;

    public Recenzija(String naslov, String opis, double ocena) {
        this.naslov = naslov;
        this.opis = opis;
        this.ocena = ocena;
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

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }
}
