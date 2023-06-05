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
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		pizza modelPizza = new pizza(null, null, null, null, null, null, null, 0);
		pizzaView viewPizza = new pizzaView();
		pizzaController controllerPizza = new pizzaController(modelPizza, viewPizza);
		
		salgado modelSalgado = new salgado(null, null, null, null, 0);
		salgadoView viewSalgado = new salgadoView();
		salgadoController controllerSalgado = new salgadoController(modelSalgado, viewSalgado);
		
		lanche modelLanche = new lanche(null, null, null, null, null, null, null, 0);
		lancheView viewLanche = new lancheView();
		lancheController controllerLanche = new lancheController(modelLanche, viewLanche);
		
		viewPizza.setVisible(true);
		viewLanche.setVisible(true);
		viewSalgado.setVisible(true);
	}
}
