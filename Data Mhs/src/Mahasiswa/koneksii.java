package Mahasiswa;
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksii {
    Connection fahri;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection fahri = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiswa1","root","");
            return fahri;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
