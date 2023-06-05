package Model;

import java.util.Date;

public class pizza extends produto {

	private String molho;
	private String borda;
	private String recheio;
	private cliente cliente;
	private funcionario funcionario;

	public pizza(String molho, cliente cliente, funcionario funcionario, String borda, String recheio, Date dataValidade, double peso, double preco) {
		super(dataValidade, peso, preco);
		this.molho = molho;
		this.borda = borda;
		this.recheio = recheio;
		this.setCliente(cliente);
		this.setFuncionario(funcionario);
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}


	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	public funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
