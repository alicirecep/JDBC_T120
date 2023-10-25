package jdbcTesting;

import java.sql.*;

public class JDBC_Query01 {

    // Sizden bir JDBC sorgusu yapmaniz istendiginde ilk yapmaniz gereken is:

  //  Database yoneticinden ilgili database bilgilerini ( database access informaation) almak olmalidir.

    /*
            URL: "jdbc:mysql://45.87.83.5/u168183796_qawonder";
            USERNAME= "u168183796_qawonderuser";
            PASSWORD="1gvyfx6#Q";
     */

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

    // 1. Adim olarak: Kullanılacak veritabanı için doğru sürücüyü ekle

    Class.forName("com.mysql.jdbc.Driver");


    //2. Adim olarak : Veritabani ile iletişimi başlat

      Connection connection =  DriverManager.getConnection(  "jdbc:mysql://45.87.83.5/u168183796_qawonder",
                                                             "u168183796_qawonderuser",
                                                             "1gvyfx6#Q");



    // 3. Adim olarak :   SQL ifadeleri oluştur ve çalıştır (Select, Insert/update/delete)



       Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);


        // Bir statement olusturabilmek icin MUTLAKA bir connection`inizin olmasi gerekli.
        // Statement olusturmak bizim sorgumuz icin yeterli oalbilir ancak ilerde bu
        // statementi kullanmak istedigimizde cagirabilmek icin onu bir yere atadik.


    // 4. Adim olarak :   Sql sorgularini calistir ve gelen sonuçları işle, kaydet vb.

        String query= "SELECT name FROM u168183796_qawonder.staff";

        ResultSet resultSet = statement.executeQuery(query);

        resultSet.next();

        System.out.println(resultSet.getString("name"));

        //Joe

        resultSet.next();

        System.out.println(resultSet.getString("name"));

        //Shıvam

        resultSet.next();

        System.out.println(resultSet.getString("name"));

        resultSet.first();
        System.out.println(resultSet.getString("name"));


        resultSet.absolute(10);
        System.out.println(resultSet.getString("name"));



    }
}
