package sistema.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Equipe implements Serializable {
	@Id
	private int codigoEquipe;
	
	private String nome;
	private Date dataFundacao;
	private String cidade;
	private Usuario diretor;
	
	public Equipe(){}
	public Equipe(int codigo){
		super();
		this.codigoEquipe=codigo;
		//diretor= userATual;
		
	}
	
	public int getCodigoEquipe() {
		return codigoEquipe;
	}
	public void setCodigoEquipe(int codigoEquipe) {
		this.codigoEquipe = codigoEquipe;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Usuario getDiretor() {
		return diretor;
	}
	public void setDiretor(Usuario diretores) {
		this.diretor = diretores;
	}
	
	
}
