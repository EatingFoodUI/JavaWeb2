package LogSign.util;

import java.sql.*;


public class DBconn {
    static String url = "jdbc:mysql://localhost:3306/javaweb";
    static String username = "root";
    static String password = "4612378";
    static Connection conn = null;
    // 结果集
    static ResultSet rs = null;
    // 执行sql
    static PreparedStatement ps = null;
    public static void init(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
        }catch (Exception e)
        {
            System.out.println("init [SQL驱动程序初始化失败！]");
            e.printStackTrace();
        }
    }

    // 增删改查
    public static int addUpdDel(String sql){
        int i = 0;
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            i = ps.executeUpdate();
        }catch (SQLException e)
        {
            System.out.println("sql增删改查异常");
            e.printStackTrace();
        }
        return i;
    }

    public static ResultSet selectSql(String sql){
        try{
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        }catch (SQLException e){
            System.out.println("Sql数据库查询异常");
            e.printStackTrace();
        }
        return rs;
    }

    public static void closeConn(){
        try{
            conn.close();
        }catch(SQLException e){
            System.out.println("sql数据库关闭异常");
            e.printStackTrace();
        }
    }
}
