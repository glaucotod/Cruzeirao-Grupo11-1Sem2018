package sistema.modelos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Campeonato implements Serializable {

	@Id
	private int codigoCampeonato;
	private String nomeCampeonato;
	private List<Local> locais;
	private List<Juiz> juizes;

	@OneToMany(mappedBy = "campeonato")
	private List<Categoria> categorias;
	private Date dataInicioInscricao;
	private Date dataFimInscricao;
	private int anoCampeonato;
	private boolean inscricao = true;
	private Date dataInicioCampeonato;
	private Date dataFimCampeonato;
	private double valorTaxa;

	public Campeonato() {
	}

	public Campeonato(int codigo) {
		super();
		this.codigoCampeonato = codigo;
		dataInicioInscricao = new Date();
		anoCampeonato = Calendar.getInstance().get(Calendar.YEAR);
	}

	public int getCodigoCampeonato() {
		return codigoCampeonato;
	}

	public void setCodigoCampeonato(int codigoCampeonato) {
		this.codigoCampeonato = codigoCampeonato;
	}

	public String getNomeCampeonato() {
		return nomeCampeonato;
	}

	public void setNomeCampeonato(String nomeCampeonato) {
		this.nomeCampeonato = nomeCampeonato;
	}

	public List<Local> getLocais() {
		return locais;
	}

	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}

	public List<Juiz> getJuizes() {
		return juizes;
	}

	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void addCategorias(Categoria categoria) {
		this.categorias.add(categoria);
	}

	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}

	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}

	public Date getDataFimInscricao() {
		return dataFimInscricao;
	}

	public void setDataFimInscricao(Date dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}

	public int getAnoCampeonato() {
		return anoCampeonato;
	}

	public void setAnoCampeonato(int anoCampeonato) {
		this.anoCampeonato = anoCampeonato;
	}

	public boolean isInscricao() {
		return inscricao;
	}

	public void setInscricao(boolean inscricao) {
		this.inscricao = inscricao;
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

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCampeonato == null) ? 0 : nomeCampeonato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campeonato other = (Campeonato) obj;
		if (nomeCampeonato == null) {
			if (other.nomeCampeonato != null)
				return false;
		} else if (!nomeCampeonato.equals(other.nomeCampeonato))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Campeonato [codigoCampeonato=" + codigoCampeonato + ", nomeCampeonato=" + nomeCampeonato + ", locais="
				+ locais + ", juizes=" + juizes + ", categorias=" + categorias + ", dataInicioInscricao="
				+ dataInicioInscricao + ", dataFimInscricao=" + dataFimInscricao + ", anoCampeonato=" + anoCampeonato
				+ ", inscricao=" + inscricao + ", dataInicioCampeonato=" + dataInicioCampeonato + ", dataFimCampeonato="
				+ dataFimCampeonato + ", valorTaxa=" + valorTaxa + "]";
	}
}
