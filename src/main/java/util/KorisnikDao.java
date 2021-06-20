package util;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class    KorisnikDao {

    static Connection conn = BazaUtil.getConnection();

    /**
     * Metoda za login. Proverava da li uneto korisnicko ime i sifra postoje u bazi podataka
     *
     * @param username
     * @param password
     * @return true ili false u zavisnosti od toga da li je korisnik uspesno ulogovan
     */
    public static boolean login(String username, String password) {
        String sql = "SELECT * FROM korisnik WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }

    }
}
