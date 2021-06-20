package util;

import entities.Knjiga;
import entities.Recenzija;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecenzijaDao {
    private static Connection conn = BazaUtil.getConnection();

    public static List<Recenzija> getRecenzijeByKnjiga(Knjiga k) {
        List<Recenzija> recenzije = new ArrayList<>();
        String sql = "SELECT * FROM recenzija WHERE isbn = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, k.getIsbn());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String naslov = rs.getString("naslov");
                String opis = rs.getString("opis");
                double ocena = rs.getDouble("ocena");
                Recenzija r = new Recenzija(naslov, opis, ocena);
                recenzije.add(r);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return recenzije;
    }
}
