package br.com.aulaDIO;

import java.lang.invoke.StringConcatException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {
        // Aqui estão duas formas
        // Servers usado: Mariadb ou mysql-server

        String driver = "mariadb"; // ou mysql
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one";
        String user = "root";
        String password = "03568799We";

        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);
        String urlConn = sb.toString();

        try (Connection conn = DriverManager.getConnection(urlConn, user, password)){
            System.out.println("Sucesso ao conectar ao banco mysql; server MariaDB");
        }catch (SQLException e) {
            System.out.println("Falha ao se conectar com o banco mysql; server MariaDB");
            e.printStackTrace();
        }

//        String urlConn = "jdbc:mysql://localhost/digital_innovation_one";
//
//        try (Connection conn = DriverManager.getConnection(urlConn, "root", "03568799We")){
//            System.out.println("Sucesso!");
//        } catch (Exception e) {
//            System.out.println("Falhou!");
//        }
    }
}
