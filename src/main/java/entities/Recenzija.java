package entities;

public class Recenzija {
    private String naslov;
    private String opis;
    private int ocena;

    public Recenzija(String naslov, String opis, int ocena) {
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

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}
