package Model;

import java.util.Date;

public class salgado extends produto {
	private String tipo;
	private String massa;
	private String tamanho;
	private double preco;
	private cliente cliente;
	private funcionario funcionario;

	public salgado(String tamanho, pessoa pessoa, String tipo, Date dataValidade, double preco) {
		super(dataValidade, preco);
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.setCliente(cliente);
		this.setFuncionario(funcionario);
		this.preco = calculaPreco(tamanho);
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
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