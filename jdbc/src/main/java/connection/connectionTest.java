package connection;

import java.sql.*;
import java.util.Properties;

public class connectionTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //获取Mysql实现类
//        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql","root","root");
        //获取sql执行对象
        Statement statement = conn.createStatement();

        //执行Sql
        String query = "SELECT * FROM db";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.println(resultSet.getString("User"));
        }
        String name = "";
        String pwd = "";

        String query2 = "SELECT * FROM db WHERE name=? and pwd = ?";
        PreparedStatement pst = conn.prepareStatement(query2);
        pst.setString(1,name);
        pst.setString(2,pwd);
        pst.executeQuery();


        statement.close();
        conn.close();
    }


}
