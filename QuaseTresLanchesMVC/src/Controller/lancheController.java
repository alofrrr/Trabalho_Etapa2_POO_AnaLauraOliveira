package Controller;

import Model.cliente;
import Model.funcionario;
import Model.lanche;
import View.cadastroCLancheView;
import View.cadastroFLancheView;
import View.lancheView;

import java.util.List;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class lancheController {
	private lanche model;
	private lancheView view;
	private List<cliente> clientes;
	private List<funcionario> funcionarios;
	private List<lanche> pedidos;

	public lancheController(lanche model, lancheView view) {
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
			String pao = view.getPao();
			String recheio = view.getRecheio();
			String molho = view.getMolho();
			cliente cliente = clientes.get(view.getCliente());
			funcionario funcionario = funcionarios.get(view.getFuncionario());
			model.setPao(pao);
			model.setMolho(molho);
			model.setPreco(preco);
			model.setCliente(cliente);
			model.setFuncionario(funcionario);
			pedidos.add(new lanche(molho, cliente, funcionario, pao, recheio, null, 0, preco));
			JOptionPane.showMessageDialog(null, "Sucesso ao fazer pedido!");

		}

	}

	public class NovoClienteListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cadastroCLancheView cadastrarCliente = new cadastroCLancheView(lancheController.this);
			cadastrarCliente.setVisible(true);
		}

	}

	public class NovoFuncionarioListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cadastroFLancheView cadastrarFuncionario = new cadastroFLancheView(lancheController.this);
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
