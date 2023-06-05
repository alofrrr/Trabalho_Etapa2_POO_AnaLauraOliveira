package Model;

public class funcionario extends pessoa {
	private double salario;
	private String cargo;

	public funcionario(String nome, String cpf, double salario, String cargo) {
		super(nome, cpf);
		this.setSalario(salario);
		this.setCargo(cargo);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
