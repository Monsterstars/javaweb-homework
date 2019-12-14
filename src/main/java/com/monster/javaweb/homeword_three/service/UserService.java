package com.monster.javaweb.homeword_three.service;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * @auther: Monster
 * @date: 2019/12/14
 * @description:
 */

@Service
public class UserService {
    private static final String url = "jdbc:mysql://localhost:3306/javaweb";
    private static final String name = "com.mysql.cj.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "123456";
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet;

    public String getUser(String id)throws Exception {
        if (id.equals("0")) {
            String sql1 = "SELECT * FROM tbl_user;";
            try {
                Class.forName(name);
                conn = DriverManager.getConnection(url, username, password);
                preparedStatement = conn.prepareStatement(sql1);
                resultSet = preparedStatement.executeQuery();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            String sql2 = "SELECT * FROM tbl_user where id = ?;";
            try {
                Class.forName(name);
                conn = DriverManager.getConnection(url, username, password);
                preparedStatement = conn.prepareStatement(sql2);
                preparedStatement.setString(1,id);
                resultSet = preparedStatement.executeQuery();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        resultSet.next();
        String msg = "name="+resultSet.getString("name")+"\npasword="+resultSet.getString("password")+"\nage="+resultSet.getString("age");
        while (true){
            msg = msg + "name="+resultSet.getString("name")+"\npasword="+resultSet.getString("password")+"\nage="+resultSet.getString("age");
            if (resultSet.next()){
                break;
            }
        }
        return msg;
    }
}
