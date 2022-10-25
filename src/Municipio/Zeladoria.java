package Municipio;

import java.util.ArrayList;
import java.util.List;

public class Zeladoria {
	
	private String nomeSecretario;
	private double avaliacao;
	private boolean avisarFuncionarioZelador = false;
	
	private List<Municipe>municipe = new ArrayList<>();
	private List<FuncionarioZeladoria>funcionarioZeladoria = new ArrayList<>();
	
	public Zeladoria(String nomeSecretario) {
		
		this.nomeSecretario = nomeSecretario;
	}
	
		
	public boolean isAvisarFuncionarioZelador() {
		return avisarFuncionarioZelador;
	}

	public void setAvisarFuncionarioZelador(boolean avisarFuncionarioZelador) {
		this.avisarFuncionarioZelador = avisarFuncionarioZelador;
	}

	public String getNomeSecretario() {
		return nomeSecretario;
	}

	public void setNomeSecretario(String nomeSecretario) {
		this.nomeSecretario = nomeSecretario;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public List<Municipe> getMunicipe() {
		return municipe;
	}

	public void setMunicipe(List<Municipe> municipe) {
		this.municipe = municipe;
	}

	public List<FuncionarioZeladoria> getFuncionarioZeladoria() {
		return funcionarioZeladoria;
	}

	public void setFuncionarioZeladoria(List<FuncionarioZeladoria> funcionarioZeladoria) {
		this.funcionarioZeladoria = funcionarioZeladoria;
	}
	
	public void addMunicipe(Municipe obj) {
		municipe.add(obj);
	}
	
	public void removeMunicipe(Municipe obj) {
		municipe.remove(obj);
	}
	
	public int countMunicipe() {
		return municipe.size();
	}
	
	public Municipe getMunicipe(int i) {
		return municipe.get(i);
	}
	
	public void addFuncioanarioZeladoria(FuncionarioZeladoria obj) {
		funcionarioZeladoria.add(obj);
	}
		
	public void removeFuncionanrioZeladoria(FuncionarioZeladoria obj) {
		funcionarioZeladoria.remove(obj);
	}
	
	public int countFuncioanarioZeladoria() {
		return funcionarioZeladoria.size();
	}
	
	public FuncionarioZeladoria getFuncioanarioZeladoria(int i) {
		return funcionarioZeladoria.get(i);
	}

	@Override
	public String toString() {
		return "Zeladoria [nomeSecretario=" + nomeSecretario + ", avaliacao=" + avaliacao + "]";
	}


	
}
