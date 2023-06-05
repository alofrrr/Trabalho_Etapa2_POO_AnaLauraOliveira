package Model;

import java.util.Date;

public class produto {
    private Date dataValidade;
    private double peso;
    private double preco;

    public produto(Date dataValidade, double peso, double preco){
        this.dataValidade = dataValidade;
        this.peso = peso;
        this.preco = preco;
    }



	public Date getDataValidade() {
        return dataValidade;
    }

    public double getPeso() {
        return peso;
    }
    
	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
