package jdbcTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Query01 {

    // Sizden bir JDBC sorgusu yapmaniz istendiginde ilk yapmaniz gereken is:

  //  Database yoneticinden ilgili database bilgilerini ( database access informaation) almak olmalidir.

    /*
            URL: "jdbc:mysql://45.87.83.5/u168183796_qawonder";
            USERNAME= "wonderworld_qawcollegeuser";
            PASSWORD="1gvyfx6#Q";
     */

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

    // 1. Adim olarak: Kullanılacak veritabanı için doğru sürücüyü ekle

    Class.forName("mysql.jdbc.Driver");


    //2. Adim olarak : Veritabani ile iletişimi başlat

      Connection connection =  DriverManager.getConnection(  "jdbc:mysql://45.87.83.5/u168183796_qawonder",
                                                             "wonderworld_qawcollegeuser",
                                                             "1gvyfx6#Q");


    }
}
