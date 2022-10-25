package Municipio;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Negocio.RelatarProblema;

public class Equipe {
	
	private Set<Membro> membro = new HashSet<>();
	private FuncionarioZeladoria funcionarioZeladoriaChefe;
	private RelatarProblema relatarProblema;
	private boolean liberarEquipe;

	
	public String localDoConserto(List<RelatarProblema> relatarProblemas, int index) {
		
		String localDoConserto = "Local Do Conserto ";
		for (RelatarProblema relatarProblema : relatarProblemas) {
			
			localDoConserto += "\n\n";
			localDoConserto += String.format("Bairro -> %20s  Rua -> %20s  Numero ->  %20s \n", 
					relatarProblema.getEndereco().getBairro(),
					relatarProblema.getEndereco().getRua(),
					relatarProblema.getEndereco().getNumero());
		}
		
		localDoConserto += "\n";
		return localDoConserto;
	}
	
	public boolean solucionarProblema(Municipe municipe, List<RelatarProblema> relatarProblema ,int index, boolean resolucao) {
		if(municipe.isConsertou() != resolucao) {
			
		relatarProblema.get(index).setStatusProblema(false);;
		municipe.setConsertou(true);
		
		return true;
		
		}
		return false;
	}
	
	
	public boolean isLiberarEquipe() {
		return liberarEquipe;
	}
	
	public void setLiberarEquipe(boolean liberarEquipe) {
		this.liberarEquipe = liberarEquipe;
	}
	
	public void inserirMembroEquipe(Especialidade especialidade) {
		this.membro.add(new Membro(especialidade));
	}

	public int contagemFuncionariosObra() {
		return this.membro.size();
	}
		
	public Set<Membro> getMembros() {
		return membro;
	}
	
	public void setMembro(Set<Membro> membros) {
		this.membro = membros;
	}

	public FuncionarioZeladoria getFuncionarioZeladoriaChefe() {
		return funcionarioZeladoriaChefe;
	}
	
	public void setFuncionarioZeladoriaChefe(FuncionarioZeladoria funcionarioZeladoriaChefe) {
		this.funcionarioZeladoriaChefe = funcionarioZeladoriaChefe;
	}

	public RelatarProblema getRelatarProblema() {
		return relatarProblema;
	}

	public void setRelatarProblema(RelatarProblema relatarProblema) {
		this.relatarProblema = relatarProblema;
	}

	

}
