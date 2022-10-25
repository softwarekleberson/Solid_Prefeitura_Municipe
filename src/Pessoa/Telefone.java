package Pessoa;

public class Telefone {

	private String telefone;
	private String ddd;
	
	public Telefone(String telefone, String ddd) {
		
		setTelefone(telefone);
		setDdd(ddd);

	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if(telefone.strip() == null || !telefone.strip().matches("\\d{8} |\\d{9}")) {
			throw new IllegalArgumentException("Telefone Invalido");
		}
		this.telefone = telefone;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		if(ddd.strip() == null || !ddd.strip().matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD Invalido");
		}
		this.ddd = ddd;
	}

	@Override
	public String toString() {
		return "Telefone [telefone=" + telefone + ", ddd=" + ddd + "]";
	}
	
	
}
