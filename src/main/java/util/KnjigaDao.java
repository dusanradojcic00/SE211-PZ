package util;

import entities.Autor;
import entities.Knjiga;
import entities.Recenzija;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KnjigaDao {
    private static Connection conn = BazaUtil.getConnection();

    /**
     * Metoda traži sve knjige u bazi, povlači sve podatke, i Autora i listu recenzija
     *
     * @return Listu svih knjiga iz baze
     */
    public static List<Knjiga> getAll() {
        String sql = "SELECT * FROM knjiga";
        List<Knjiga> lista = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String isbn = rs.getString("isbn");
                String naslov = rs.getString("naslov");
                String opis = rs.getString("opis");
                Knjiga knjiga = new Knjiga(isbn, naslov, opis);
                Autor autor = AutorDao.getAutorByKnjiga(knjiga);
                knjiga.setAutor(autor);
                List<Recenzija> recenzije = RecenzijaDao.getRecenzijeByKnjiga(knjiga);
                knjiga.setRecenzije(recenzije);
                knjiga.izracunajProsek();
                lista.add(knjiga);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista;

    }

}
