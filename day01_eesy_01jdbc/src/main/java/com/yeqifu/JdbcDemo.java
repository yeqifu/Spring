package com.yeqifu;

import java.sql.*;

/**
 * @Author: 落亦-
 * @Date: 2020/3/2 11:13
 */
public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        //1.注册数据库驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy?useUnicode=true&characterEncoding=utf8&useSSL=true&serverTimezone=UTC&useSSL=false","root","123456");
        //3.声明预处理语句
        PreparedStatement pstm = connection.prepareStatement("select * from account");
        //4.执行SQL，得到结果集
        ResultSet resultSet = pstm.executeQuery();
        //5.遍历结果集
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        //6.释放资源
        resultSet.close();
        pstm.close();
        connection.close();
    }
}
