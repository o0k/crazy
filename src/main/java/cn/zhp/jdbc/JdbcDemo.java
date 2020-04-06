package cn.zhp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        // 1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy?useSSL=true&serverTimezone=GMT", "root", "root");

        // 3.获取操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from account");

        // 4.执行SQL, 得到结果集
        ResultSet rs = pstm.executeQuery();

        // 5.遍历结果集
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }

        // 6.释放资源
        rs.close();
        pstm.close();
        conn.close();
    }
}
