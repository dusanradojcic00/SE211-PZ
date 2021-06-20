package util;

import entities.Autor;
import entities.Knjiga;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AutorDao {
    private static Connection conn = BazaUtil.getConnection();

    public static Autor getAutorByKnjiga(Knjiga k){
        String sql = "SELECT * FROM autor a JOIN autor_knjiga ak ON a.autor_id = ak.autor_id WHERE ak.isbn = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, k.getIsbn());
            ResultSet rs = ps.executeQuery();
            String ime = rs.getString("ime");
            String prezime = rs.getString("prezime");
            Autor a = new Autor(ime, prezime);
            return a;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }


}
