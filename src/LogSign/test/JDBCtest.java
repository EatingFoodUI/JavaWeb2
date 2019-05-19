package LogSign.test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCtest {

    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/javaweb?useUnicode=true&characterEncoding=utf8";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "4612378";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM javaweb.user";
            String Seletsql = "select * from user where name ='林格' and pwd='46123'";
            String Seletsql1 = "select * from user where name='mikeli' and pwd='4612378'";
            String Seletsql2 = "select * from user";

            ResultSet rs = stmt.executeQuery(Seletsql1);
            ResultSet rs1 = stmt.executeQuery(Seletsql2);

            // "select * from user where name=`" + name +"` and pwd=`" + pwd + "`"展开结果集数据库
            while(rs1.next()){
                // 通过字段检索
                int id  = rs1.getInt("id");
                String name = rs1.getString("name");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 名称: " + name);
                System.out.print("\n");
            }
            // 完成后关闭
            rs1.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}

