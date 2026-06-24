package dao.utils;
import java.sql.*;

public class DBUtil {
    static Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    private static final String URL = "jdbc:mysql://localhost:3306/epet?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "han284543";

    // 静态代码块加载驱动（只加载一次
    public static void loadDriver() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("驱动加载成功");
        }
        catch (ClassNotFoundException e){
            System.out.println("驱动加载失败");
        }
    }

    public Connection getConnection()  {
        try{
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = conn.createStatement();
            System.out.println("连接成功");
            return conn;
        }
        catch (SQLException e){
            System.out.println("连接失败");
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
        DBUtil dbUtil = new DBUtil();
        conn = dbUtil.getConnection();
        Statement statement = conn.createStatement();
        int rs1 = statement.executeUpdate("insert into pet(id,name,health,love) values (3,'猫',1,1)");
        int rs2 = statement.executeUpdate("insert into pet(id,name,health,love) values (4,'鹅',2,2)");
        int rs3 = statement.executeUpdate("delete from pet where id = 1");
        int rs4 = statement.executeUpdate("update pet set name='鸟' where id=2");
        ResultSet rs5 = statement.executeQuery("select * from pet");
        System.out.println("插入1结果：" + rs1);
        System.out.println("插入2结果：" + rs2);
        System.out.println("删除结果：" + rs3);
        System.out.println("更新结果：" + rs4);
        while (rs5.next()) {
            System.out.println("id: " + rs5.getInt("id") +
                    ", name: " + rs5.getString("name") +
                    ", health: " + rs5.getInt("health") +
                    ", love: " + rs5.getInt("love"));
        }
    }
}

//package dao.utils;
//import java.io.InputStream;
//import java.sql.*;
//        import java.util.Properties;
//
//public class DBUtil {
//    private static String driver;
//    private static String url;
//    private static String username;
//    private static String password;
//
//    static {
//        try {
//            // 读取配置文件
//            InputStream is = DBUtil.class.getClassLoader()
//                    .getResourceAsStream("db.properties");
//            Properties props = new Properties();
//            props.load(is);
//
//            driver = props.getProperty("db.driver");
//            url = props.getProperty("db.url");
//            username = props.getProperty("db.username");
//            password = props.getProperty("db.password");
//
//            Class.forName(driver);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(url, username, password);
//    }
//
//    public static void main(String[] args) throws SQLException {
//        Connection conn = getConnection();
//        System.out.println("连接成功");
//        Statement stmt = conn.createStatement();
//        int rs1 = stmt.executeUpdate("insert into borrow(id,name, status, borrowDate) values(0,'test', 0, '2025-06-01')");
//        ResultSet rs = stmt.executeQuery("select * from borrow");
//        while (rs.next()) {
//            System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("status") + " " + rs.getString("borrowDate"));
//        }
//        conn.close();
//    }
//}

