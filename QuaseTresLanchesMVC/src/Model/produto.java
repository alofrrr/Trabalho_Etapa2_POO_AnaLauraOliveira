package Model;

import java.util.Date;

public class produto {
    private Date dataValidade;
    private double peso;

    public produto(Date dataValidade, double peso){
        this.dataValidade = dataValidade;
        this.peso = peso;
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
	
}
