package Controller;

import Model.cliente;
import Model.funcionario;
import Model.pizza;
import View.cadastroCPizzaView;
import View.cadastroFPizzaView;
import View.pizzaView;

import java.util.List;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class pizzaController {
	private pizza model;
	private pizzaView view;
	private List<cliente> clientes;
	private List<funcionario> funcionarios;
	private List<pizza> pedidos;

	public pizzaController(pizza model, pizzaView view) {
		super();
		this.model = model;
		this.view = view;
		this.clientes = new ArrayList<>();
		this.funcionarios = new ArrayList<>();
		this.pedidos = new ArrayList<>();
		this.view.addPedidoListener(new PedidoListener());
		this.view.addNovoClienteListener(new NovoClienteListener());
		this.view.addNovoFuncionarioListener(new NovoFuncionarioListener());
	}

	public class PedidoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double preco = Double.parseDouble(view.getPreco());
			String borda = view.getBorda();
			String recheio = view.getRecheio();
			String molho = view.getMolho();
			cliente cliente = clientes.get(view.getCliente());
			funcionario funcionario = funcionarios.get(view.getFuncionario());
			model.setBorda(borda);
			model.setMolho(molho);
			model.setPreco(preco);
			model.setCliente(cliente);
			model.setFuncionario(funcionario);
			pedidos.add(new pizza(molho, cliente, funcionario, borda, recheio, null, 0, preco));
			JOptionPane.showMessageDialog(null, "Sucesso ao fazer pedido!");

		}

	}

	public class NovoClienteListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cadastroCPizzaView cadastrarCliente = new cadastroCPizzaView(pizzaController.this);
			cadastrarCliente.setVisible(true);
		}

	}

	public class NovoFuncionarioListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cadastroFPizzaView cadastrarFuncionario = new cadastroFPizzaView(pizzaController.this);
			cadastrarFuncionario.setVisible(true);
		}

	}

	public void cadastrarCliente(String nome, String cpf, String aniversario) {
		cliente cliente = new cliente(nome, cpf, aniversario);
		clientes.add(cliente);
		view.atualizarListaCliente(clientes);
	}

	public void cadastrarFuncionario(String nome, String cpf, double salario, String cargo) {
		funcionario funcionario = new funcionario(nome, cpf, salario, cargo);
		funcionarios.add(funcionario);
		view.atualizarListaFuncionario(funcionarios);
	}

}
