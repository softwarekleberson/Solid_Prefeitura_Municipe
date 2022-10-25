package Municipio;

import java.util.ArrayList;
import java.util.List;

import Negocio.RelatarProblema;
import Pessoa.Cpf;
import Pessoa.Email;
import Pessoa.Telefone;
import Pessoa.Usuario;

public class FuncionarioZeladoria {
	
	private boolean funcionarosDisponiveis;
	
	private Usuario usuario;
	private Zeladoria zeladoria;
	private List<Equipe> equipe = new ArrayList<>();
	private List <RelatarProblema> relatarProblema = new ArrayList<>();
	
	
	public FuncionarioZeladoria(String nome, String cpf, String email, String telefone, String ddd, Zeladoria zeladoria) {
		
		this.usuario = new Usuario(nome, new Cpf(cpf), new Email(email), new Telefone(telefone, ddd));
		this.zeladoria = zeladoria;
	}

	
	public boolean equipeResponsavelPeloConserto(boolean consertar) {
		if(consertar == true) {
			return true;
		}
		return false;
	}
	
	
	public boolean isFuncionarosDisponiveis() {
		return funcionarosDisponiveis;
	}

	public void setFuncionarosDisponiveis(boolean funcionarosDisponiveis) {
		this.funcionarosDisponiveis = funcionarosDisponiveis;
	}

	public List<RelatarProblema> getRelatarProblema() {
		return relatarProblema;
	}

	public void setRelatarProblema(List<RelatarProblema> relatarProblema) {
		this.relatarProblema = relatarProblema;
	}

	public void addRelatarProblema(RelatarProblema obj) {
		relatarProblema.add(obj);
	}
	
	public void removeRelatarProblema(RelatarProblema obj) {
		relatarProblema.remove(obj);
	}
	
	public Zeladoria getZeladoria() {
		return zeladoria;
	}

	public void setZeladoria(Zeladoria zeladoria) {
		this.zeladoria = zeladoria;
	}

	public List<Equipe> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Equipe> equipe) {
		this.equipe = equipe;
	} 
	
	public void addEquipe(Equipe obj) {		 
		equipe.add(obj);
	}
		
	public void removeEquipe(Equipe obj) {
		equipe.remove(obj);
	}
	
	public int countEquipe() {
		return equipe.size();
	}
	
	public Equipe getEquipe(int i) {
		return equipe.get(i);
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
