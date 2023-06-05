package Model;

import java.util.Date;

public class salgado extends produto {
	private String tipo;
	private String massa;
	private String recheio;
	private double preco;
	private cliente cliente;
	private funcionario funcionario;

	public salgado(String massa, String recheio, cliente cliente, funcionario funcionario, String tipo, Date dataValidade, double peso, double preco) {
		super(dataValidade, peso, preco);
		this.setMassa(massa);
		this.setTipo(tipo);
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

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

}