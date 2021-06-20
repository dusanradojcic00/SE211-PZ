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
        String sql = "SELECT * FROM autor a JOIN knjiga k on a.autor_id = k.autor_id WHERE k.isbn = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, k.getIsbn());
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                Autor a = new Autor(ime, prezime);
                return a;
            }
            return null;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }


}
