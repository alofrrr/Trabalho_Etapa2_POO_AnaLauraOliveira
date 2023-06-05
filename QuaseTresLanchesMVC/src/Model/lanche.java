package Model;

import java.util.Date;

public class lanche extends produto{

	private String molho;
	private String pao;
	private String recheio;
	private String tamanho;
	private cliente cliente;
	private funcionario funcionario;
	private double preco;

	public lanche(String molho, String tamanho, cliente cliente, funcionario funcionario, String pao, String recheio,
			Date dataValidade, double peso) {
		super(dataValidade, peso);
		this.setMolho(molho);
		this.setPao(pao);
		this.tamanho = tamanho;
		this.setCliente(cliente);
		this.setFuncionario(funcionario);
		this.preco = calculaPreco(tamanho);
	}

	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setPreco (double preco) {
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
