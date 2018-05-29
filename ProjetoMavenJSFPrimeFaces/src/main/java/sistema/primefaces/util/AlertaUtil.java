package sistema.primefaces.util;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 * Classe para exibir mensagens
 * 
 */

public class AlertaUtil{


	protected static final String ID_GROWL = "mensagemGrowl";


	protected static final String ID_MESSAGE = null;

	private static final String MENSAGEM_VAZIA = "";


	public void exibirErroGrowl(String cabecalho, String detalhes) {
        adicionarMensagem(FacesMessage.SEVERITY_ERROR, ID_GROWL, cabecalho, detalhes);
	}


	public void exibirErroGrowl(String cabecalho) {
        adicionarMensagem(FacesMessage.SEVERITY_ERROR, ID_GROWL, cabecalho,
        		MENSAGEM_VAZIA);
	}


	public void exibirErroMensagem(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_ERROR, ID_MESSAGE, cabecalho, detalhes);
	}


	public void exibirErroMensagem(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_ERROR, ID_MESSAGE, cabecalho,
				MENSAGEM_VAZIA);
	}


	public void exibirFatalGrowl(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_FATAL, ID_GROWL, cabecalho, detalhes);
	}


	public void exibirFatalGrowl(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_FATAL, ID_GROWL, cabecalho,
				MENSAGEM_VAZIA);
	}


	public void exibirFatalMensagem(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_FATAL, ID_MESSAGE, cabecalho, detalhes);
	}


	public void exibirFatalMensagem(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_FATAL, ID_MESSAGE, cabecalho,
				MENSAGEM_VAZIA);
	}
	

	public void exibirInfoGrowl(String cabecalho, String detalhes) {
        adicionarMensagem(FacesMessage.SEVERITY_INFO, ID_GROWL, cabecalho, detalhes);
	}


	public void exibirInfoGrowl(String cabecalho) {
        adicionarMensagem(FacesMessage.SEVERITY_INFO, ID_GROWL, cabecalho,
        		MENSAGEM_VAZIA);
	}


	public void exibirInfoMensagem(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_INFO, ID_MESSAGE, cabecalho, detalhes);
	}


	public void exibirInfoMensagem(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_INFO, ID_MESSAGE, cabecalho,
				MENSAGEM_VAZIA);
	}


	public void exibirWarnGrowl(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_WARN, ID_GROWL, cabecalho, detalhes);
	}


	public void exibirWarnGrowl(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_WARN, ID_GROWL, cabecalho,
				MENSAGEM_VAZIA);
	}

	public void exibirWarnMensagem(String cabecalho, String detalhes) {
		adicionarMensagem(FacesMessage.SEVERITY_WARN, ID_MESSAGE, cabecalho, detalhes);
	}


	public void exibirWarnMensagem(String cabecalho) {
		adicionarMensagem(FacesMessage.SEVERITY_WARN, ID_MESSAGE, cabecalho,
				MENSAGEM_VAZIA);
	}

	private void adicionarMensagem(Severity severidade, String clientId, 
			String cabecalho, String detalhes) {
		FacesMessage message = new FacesMessage(severidade, cabecalho, detalhes);
        FacesContext.getCurrentInstance().addMessage(clientId, message);
	}
}