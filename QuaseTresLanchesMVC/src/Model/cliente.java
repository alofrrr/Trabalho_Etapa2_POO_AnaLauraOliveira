package Model;

public class cliente extends pessoa {
	
	private String aniversario;

	public cliente(String nome, String cpf, String aniversario) {
		super(nome, cpf);
		this.aniversario = aniversario;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	
	

}
