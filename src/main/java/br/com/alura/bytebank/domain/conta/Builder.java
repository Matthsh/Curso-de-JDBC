package br.com.alura.bytebank.domain.conta;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Builder {
    public static Conta contaBuilder(ResultSet info) throws SQLException {
        Conta conta = new Conta();
        conta.setNumero(info.getInt(1));
        return conta;
    }
}
