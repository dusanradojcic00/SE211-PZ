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
        String sql = "SELECT * FROM autor a JOIN knjiga k on a.autor_id = k.knjiga_id WHERE k.isbn = ? LIMIT 1";
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
