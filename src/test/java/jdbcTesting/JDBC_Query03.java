package jdbcTesting;

import java.sql.*;

import static org.junit.Assert.*;

public class JDBC_Query03 {

    public static void main(String[] args) throws SQLException {

      Connection connection = DriverManager.getConnection("jdbc:mysql://45.87.83.5/u168183796_qawonder",
                                    "u168183796_qawonderuser",
                                    "1gvyfx6#Q");

      Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

      String query = "SELECT * FROM u168183796_qawonder.roles";

      ResultSet resultSet = statement.executeQuery(query);


      resultSet.absolute(4);
        System.out.println(resultSet.getString("name"));


      String expectedData= "Librarian";
      String actualData = resultSet.getString("name");

        assertEquals(expectedData,actualData);


    // 5. Adim olarak : Veritabanı bağlantısını bitir  .

        //Last In First Out = LIFO

        resultSet.close();
        statement.close();
        connection.close();



    }
}
