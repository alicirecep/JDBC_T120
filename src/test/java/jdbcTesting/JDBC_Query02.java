package jdbcTesting;

import java.sql.*;

public class JDBC_Query02 {
    public static void main(String[] args) throws SQLException {

       Connection connection = DriverManager.getConnection("jdbc:mysql://45.87.83.5/u168183796_qawonder",
                                    "u168183796_qawonderuser",
                                    "1gvyfx6#Q");

      Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

                 String query = "SELECT * FROM u168183796_qawonder.staff";

      ResultSet resultSet = statement.executeQuery(query);

                resultSet.next();
        System.out.println(resultSet.getString("surname"));

                // Black

        System.out.println(resultSet.getString(10));

                //Black

        resultSet.next();

        System.out.println(resultSet.getString("father_name"));




    }
}
