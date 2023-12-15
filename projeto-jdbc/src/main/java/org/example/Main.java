package org.example;


import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/loja-teach";
        String user = "postgres";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from customers");

            while (resultSet.next()){
                String name = resultSet.getString("name");
                String lastName = resultSet.getString("last_name");
                System.out.println("nome: " + name);
                System.out.println("sobrenome: " + lastName);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}