package entities;

public class Korisnik extends Osoba {
    private String username;
    private String password;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime, String username, String password) {
        super(ime, prezime);
        this.username = username;
        this.password = password;
    }

    public Korisnik(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
