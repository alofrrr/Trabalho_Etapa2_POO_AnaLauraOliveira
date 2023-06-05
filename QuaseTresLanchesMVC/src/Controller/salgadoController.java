package Controller;

import Model.cliente;
import Model.funcionario;
import Model.pizza;
import Model.salgado;
import View.cadastroCSalgadoView;
import View.cadastroFSalgadoView;
import View.salgadoView;

import java.util.List;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class salgadoController {
	private salgado model;
	private salgadoView view;
	private List<cliente> clientes;
	private List<funcionario> funcionarios;
	private List<salgado> pedidos;

	public salgadoController(salgado model, salgadoView view) {
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
			String massa = view.getMassa();
			String recheio = view.getRecheio();
			String tipo = view.getTipo();
			double preco = Double.parseDouble(view.getPreco());
			cliente cliente = clientes.get(view.getCliente());
			funcionario funcionario = funcionarios.get(view.getFuncionario());
			model.setMassa(massa);
			model.setTipo(tipo);
			model.setRecheio(recheio);
			model.setPreco(preco);
			model.setCliente(cliente);
			model.setFuncionario(funcionario);
			pedidos.add(new salgado(massa, tipo, cliente, funcionario, tipo, null, 0, preco));
			JOptionPane.showMessageDialog(null, "Sucesso ao fazer Pedido!");

		}

	}

	public class NovoClienteListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cadastroCSalgadoView cadastrarCliente = new cadastroCSalgadoView(salgadoController.this);
			cadastrarCliente.setVisible(true);
		}

	}

	public class NovoFuncionarioListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cadastroFSalgadoView cadastrarFuncionario = new cadastroFSalgadoView(salgadoController.this);
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
