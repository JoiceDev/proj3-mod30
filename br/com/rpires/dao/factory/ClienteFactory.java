package br.com.rpires.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.rpires.domain.Cliente;

/**
 * Fábrica para criação de objetos Cliente a partir do ResultSet
 * 
 * @author rodrigo.pires
 */
public class ClienteFactory {
    
    /**
     * Converte um ResultSet em um objeto Cliente
     * 
     * @param rs ResultSet com os dados do cliente
     * @return Objeto Cliente preenchido com os dados do ResultSet
     * @throws SQLException se ocorrer erro ao acessar o ResultSet
     */
    public static Cliente convert(ResultSet rs) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setId(rs.getLong("ID_CLIENTE"));
        cliente.setNome(rs.getString("NOME"));
        cliente.setCpf(rs.getLong("CPF"));
        cliente.setTel(rs.getLong("TEL"));
        cliente.setEnd(rs.getString("ENDERECO"));
        cliente.setNumero(rs.getInt("NUMERO"));
        cliente.setCidade(rs.getString("CIDADE"));
        cliente.setEstado(rs.getString("ESTADO"));
        cliente.setEmail(rs.getString("EMAIL")); // Novo campo
        return cliente;
    }
}