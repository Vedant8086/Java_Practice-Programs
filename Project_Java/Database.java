import java.sql.*;
public class Database {
    static final String DB_URL = "jdbc:mysql://localhost:3306/java";
    static final String USER_Name = "root";
    static final String PASSWORD = "root";
    static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static void main(String[] args)throws Exception {
        Class.forName(DB_DRIVER);
        Connection connect =DriverManager.getConnection(DB_URL,USER_Name,PASSWORD);
        System.out.println("Connection is Done");
        System.out.println("Fetching Data From Table \n");
        Statement stmt = connect.createStatement();
        String query = "SELECT * FROM SUBUJECT";
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("SUBJECT ID\t SUBJECT_NAME\tSUBJECT_MARK");
        while(rs.next()) {
            System.out.println(rs.getInt(1)+"\t\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3));
        }
        rs.close();
        stmt.close();
        connect.close();
        System.out.println("Connection is Closed");
    }
}
