package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection recuperarConexao(){
        try {
            return DriverManager                            // 3306 é a porta padrão do mysql
                    .getConnection("jdbc:mysql://localhost:3306/byte_bank?user=matthsh&password=1503");

        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}