package Pessoa;

public class Cpf {
	
	private String cpf;

	public Cpf(String cpf) {
		setCpf(cpf);
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if(cpf.strip() == null || !cpf.strip().matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
			throw new IllegalArgumentException("Cpf Invalido");
		}
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cpf [cpf=" + cpf + "]";
	}
	
	
	
}