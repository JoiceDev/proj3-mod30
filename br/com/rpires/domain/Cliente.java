package br.com.rpires.domain;

import anotacao.ColunaTabela;
import anotacao.Tabela;
import anotacao.TipoChave;
import br.com.rpires.dao.Persistente;

@Tabela("TB_CLIENTE")
public class Cliente implements Persistente {
    
    @ColunaTabela(dbName = "id", setJavaName = "setId")
    private Long id;
    
    @ColunaTabela(dbName = "nome", setJavaName = "setNome")
    private String nome;
    
    @TipoChave("getCpf")
    @ColunaTabela(dbName = "cpf", setJavaName = "setCpf")
    private Long cpf;
    
    @ColunaTabela(dbName = "tel", setJavaName = "setTel")
    private Long tel;
    
    @ColunaTabela(dbName = "endereco", setJavaName = "setEnd")
    private String end;
    
    @ColunaTabela(dbName = "numero", setJavaName = "setNumero")
    private Integer numero;
    
    @ColunaTabela(dbName = "cidade", setJavaName = "setCidade")
    private String cidade;
    
    @ColunaTabela(dbName = "estado", setJavaName = "setEstado")
    private String estado;
    
    @ColunaTabela(dbName = "email", setJavaName = "setEmail")
    private String email;
    
    // Getters e setters existentes...
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
}