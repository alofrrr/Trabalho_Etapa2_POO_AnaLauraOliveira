package Model;

import java.util.Date;

public class lanche extends produto {

	private String molho;
	private String pao;
	private String recheio;
	private cliente cliente;
	private funcionario funcionario;
	private double preco;

	public lanche(String molho, cliente cliente, funcionario funcionario, String pao, String recheio, Date dataValidade, double peso, double preco) {
		super(dataValidade, peso, preco);
		this.setMolho(molho);
		this.setPao(pao);
		this.setRecheio(recheio);
		this.setCliente(cliente);
		this.setFuncionario(funcionario);
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}


	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getPao() {
		return pao;
	}

	public void setPao(String pao) {
		this.pao = pao;
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
