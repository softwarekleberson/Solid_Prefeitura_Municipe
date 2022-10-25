package Municipio;
import java.util.ArrayList;
import java.util.List;

import AvaliacaoPrefeito.AvaliacaoPrefeito;
import Negocio.RelatarProblema;
import Pessoa.Cpf;
import Pessoa.Email;
import Pessoa.Telefone;
import Pessoa.Usuario;


public class Municipe {
	
	private String historicoSolicitacao;
	private boolean consertou = false;
	
	private Zeladoria zeladoria;
	private Usuario usuario;
	
	private List<RelatarProblema>relatarProblema = new ArrayList<>();
	private List<AvaliacaoPrefeito>avaliacaoPrefeito = new ArrayList<>();
	
	
	public Municipe(String nome, String cpf, String email, String telefone, String ddd) {
		
		this.usuario = new Usuario(nome, new Cpf(cpf), new Email(email), new Telefone(telefone, ddd));
	}

	public void aberturaConserto(Zeladoria zeladoria) {
		zeladoria.setAvisarFuncionarioZelador(true);
	}
	
	public void avaliarZeladoria(Zeladoria zeladoria, double avalicao) {
		zeladoria.setAvaliacao(avalicao);
	}
		
	public boolean isConsertou() {
		return consertou;
	}

	public void setConsertou(boolean consertou) {
		this.consertou = consertou;
	}

	public String getHistoricoSolicitacao() {
		return historicoSolicitacao;
	}

	public void setHistoricoSolicitacao(String historicoSolicitacao) {
		this.historicoSolicitacao = historicoSolicitacao;
	}
	
	public Zeladoria getZeladoria() {
		return zeladoria;
	}
	
	public void setZeladoria(Zeladoria zeladoria) {
		this.zeladoria = zeladoria;
	}

	public void addRelatarProblea(RelatarProblema obj) {
		relatarProblema.add(obj);
	}	
	
	public void removeRelatarPrblema(RelatarProblema obj) {
		relatarProblema.add(obj);
	}

	public List<RelatarProblema> getRelatarProblema() {
		return relatarProblema;
	}

	public void setRelatarProblema(List<RelatarProblema> relatarProblema) {
		this.relatarProblema = relatarProblema;
	}
	
	public List<AvaliacaoPrefeito> getAvaliacaoPrefeito() {
		return avaliacaoPrefeito;
	}

	public void setAvaliacaoPrefeito(List<AvaliacaoPrefeito> avaliacaoPrefeito) {
		this.avaliacaoPrefeito = avaliacaoPrefeito;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Municipe [historicoSolicitacao=" + historicoSolicitacao + ", consertou=" + consertou + ", zeladoria="
				+ zeladoria + ", usuario=" + usuario + ", relatarProblema=" + relatarProblema + ", avaliacaoPrefeito="
				+ avaliacaoPrefeito + "]";
	}






	






	
	
}
