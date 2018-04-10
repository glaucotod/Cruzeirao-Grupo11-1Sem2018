package sistema.modelos;

public class Categoria {
	int id;
	int idadeMinima;
	String sexo;
	boolean novosJogadores;
	boolean novosTimes;
	
	
	
	public int getIdadeMinima() {
		return idadeMinima;
	}
	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public boolean isNovosJogadores() {
		return novosJogadores;
	}
	public void setNovosJogadores(boolean novosJogadores) {
		this.novosJogadores = novosJogadores;
	}
	public boolean isNovosTimes() {
		return novosTimes;
	}
	public void setNovosTimes(boolean novosTimes) {
		this.novosTimes = novosTimes;
	}
	public int getId() {
		return id;
	}
	
	
}
