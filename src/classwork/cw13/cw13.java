package classwork.cw13;

import java.sql.*;

public class cw13 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world?serverTimezone=UTC";
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            cn = DriverManager.getConnection(url, "root", "970817gaA");
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM country");
            while (rs.next()) {
                System.out.println(
                        rs.getString("code")
                                + " "
                                + rs.getString("name")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
