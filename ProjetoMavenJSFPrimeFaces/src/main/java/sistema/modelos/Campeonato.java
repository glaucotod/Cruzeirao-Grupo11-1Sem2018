package sistema.modelos;

import java.util.List;
import java.util.Date;

public class Campeonato {
	private int id;	
	private int anoCampeonato;
	private Date dataInicioCampeonato;
	private Date dataFimCampeonato;
	private Date dataInicioInscricaoCampeonato;
	private Date dataFimInscricaoCampeonato;
	private double taxaInscricao;
	private int qtdMinimaJogadores;
	private int qtdMaxJogadores;
	private int qtdMinTimes;
	private int qtdMaxTimes;
	private String endereco;		
	private List<Local> locais;
	
	
	public int getId() {
		return id;
	}
	
	public int getAnoCampeonato() {
		return anoCampeonato;
	}
	public void setAnoCampeonato(int anoCampeonato) {
		this.anoCampeonato = anoCampeonato;
	}
	public Date getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}
	public void setDataInicioCampeonato(Date dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}
	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}
	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}
	public Date getDataInicioInscricaoCampeonato() {
		return dataInicioInscricaoCampeonato;
	}
	public void setDataInicioInscricaoCampeonato(Date dataInicioInscricaoCampeonato) {
		this.dataInicioInscricaoCampeonato = dataInicioInscricaoCampeonato;
	}
	public Date getDataFimInscricaoCampeonato() {
		return dataFimInscricaoCampeonato;
	}
	public void setDataFimInscricaoCampeonato(Date dataFimInscricaoCampeonato) {
		this.dataFimInscricaoCampeonato = dataFimInscricaoCampeonato;
	}
	public double getTaxaInscricao() {
		return taxaInscricao;
	}
	public void setTaxaInscricao(double taxaInscricao) {
		this.taxaInscricao = taxaInscricao;
	}
	public int getQtdMinimaJogadores() {
		return qtdMinimaJogadores;
	}
	public void setQtdMinimaJogadores(int qtdMinimaJogadores) {
		this.qtdMinimaJogadores = qtdMinimaJogadores;
	}
	public int getQtdMaxJogadores() {
		return qtdMaxJogadores;
	}
	public void setQtdMaxJogadores(int qtdMaxJogadores) {
		this.qtdMaxJogadores = qtdMaxJogadores;
	}
	public int getQtdMinTimes() {
		return qtdMinTimes;
	}
	public void setQtdMinTimes(int qtdMinTimes) {
		this.qtdMinTimes = qtdMinTimes;
	}
	public int getQtdMaxTimes() {
		return qtdMaxTimes;
	}
	public void setQtdMaxTimes(int qtdMaxTimes) {
		this.qtdMaxTimes = qtdMaxTimes;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Local> getLocais() {
		return locais;
	}
	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
