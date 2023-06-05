package Model;

import java.util.Date;

public class pizza extends produto {

	private String molho;
	private String borda;
	private String recheio;
	private String tamanho;
	private cliente cliente;
	private funcionario funcionario;
	private double preco;

	public pizza(String molho, String tamanho, cliente cliente, funcionario funcionario, String borda, String recheio,
			Date dataValidade, double peso) {
		super(dataValidade, peso);
		this.molho = molho;
		this.borda = borda;
		this.tamanho = tamanho;
		this.setCliente(cliente);
		this.setFuncionario(funcionario);
		this.preco = calculaPreco(tamanho);
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

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public double calculaPreco(String tamanho) {
		double preco = 0;
		
		if (tamanho != null) {
			if (tamanho.equals("p")) {
				preco = 20.0;
			} else if (tamanho.equals("m")) {
				preco = 35.0;
			} else if (tamanho.equals("g")) {
				preco = 50.0;
			}
		}
		return preco;
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
