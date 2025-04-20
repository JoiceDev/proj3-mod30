package br.com.rpires.domain;

import java.math.BigDecimal;
import anotacao.ColunaTabela;
import anotacao.Tabela;
import anotacao.TipoChave;
import br.com.rpires.dao.Persistente;

@Tabela("TB_PRODUTO")
public class Produto implements Persistente {
    
    @ColunaTabela(dbName = "id", setJavaName = "setId")
    private Long id;
    
    @TipoChave("getCodigo")
    @ColunaTabela(dbName = "codigo", setJavaName = "setCodigo")
    private String codigo;
    
    @ColunaTabela(dbName = "nome", setJavaName = "setNome")
    private String nome;
    
    @ColunaTabela(dbName = "descricao", setJavaName = "setDescricao")
    private String descricao;
    
    @ColunaTabela(dbName = "valor", setJavaName = "setValor")
    private BigDecimal valor;
    
    @ColunaTabela(dbName = "categoria", setJavaName = "setCategoria")
    private String categoria;
    
    // Getters e setters existentes...
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
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