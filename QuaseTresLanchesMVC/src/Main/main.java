package Main;

import Model.pizza;
import View.pizzaView;
import Controller.pizzaController;


import Model.salgado;
import View.salgadoView;
import Controller.salgadoController;


import Model.lanche;
import View.lancheView;
import Controller.lancheController;

public class main {
	public static void main(String[] args) {
		pizzaView viewPizza = new pizzaView();
		salgadoView viewSalgado = new salgadoView();
		lancheView viewLanche = new lancheView();
		
		viewPizza.setVisible(true);
		viewLanche.setVisible(true);
		viewSalgado.setVisible(true);
	}
}
