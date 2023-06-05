package View;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pizzaView extends JFrame {
	private JLabel cliente;
	private JComboBox<String> listaCliente;
	private JLabel funcionario;
	private JComboBox<String> listaFuncionario;
	private JButton pedido;
	private JButton novoCliente;
	private JButton novoFuncionario;
	private JLabel borda;
	private JTextField txtBorda;
	private JLabel recheio;
	private JTextField txtRecheio;
	private JLabel tamanho;
	private JTextField txtTamanho;
	private JTextField txtMolho;
	private JLabel molho;
	
	public pizzaView() {
		setTitle("Pizzas");
        setResizable(false);
        setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		 JPanel mainPanel = new JPanel();
	     mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	     
	     JLabel titleLabel = new JLabel("Pedir Pizza");
	     titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
	     titleLabel.setAlignmentX(CENTER_ALIGNMENT);
		
		molho = new JLabel("Molho desejado:");
		txtMolho = new JTextField (20);
		borda = new JLabel("Borda desejada:");
		txtBorda = new JTextField (20);
		recheio = new JLabel("Recheio desejado:");
		txtRecheio = new JTextField (20);
		tamanho = new JLabel ("Tamanho (p/m/g):");
		txtTamanho = new JTextField(10);
		cliente = new JLabel ("Cliente:");
		listaCliente = new JComboBox<>();
		novoCliente = new JButton("Cadastrar cliente");
		funcionario = new JLabel ("Funcionario:");
		listaFuncionario = new JComboBox<>();
		novoFuncionario = new JButton("Cadastrar funcionario");
		pedido = new JButton("Fazer pedido");
		
		mainPanel.add(titleLabel);
		
		mainPanel.add(molho);
		mainPanel.add(txtMolho);
		mainPanel.add(borda);
		mainPanel.add(txtBorda);
		mainPanel.add(recheio);
		mainPanel.add(txtRecheio);
		mainPanel.add(cliente);
		mainPanel.add(listaCliente);
		mainPanel.add(novoCliente);
		mainPanel.add(funcionario);
		mainPanel.add(listaFuncionario);
		mainPanel.add(novoFuncionario);
		mainPanel.add(tamanho);
		mainPanel.add(txtTamanho);
		mainPanel.add(pedido);
		
		add(mainPanel);
		
		pack();
		setLocationRelativeTo(null);
				
	}
	
	public void addPedidoListener(ActionListener listener) {
		pedido.addActionListener(listener);
				
	}
	
	public void addNovoClienteListener(ActionListener listener) {
		novoCliente.addActionListener(listener);
				
	}
	
	public void addNovoFuncionarioListener(ActionListener listener) {
		novoFuncionario.addActionListener(listener);
				
	}
	
	public int getCliente() {
		return listaCliente.getSelectedIndex(); 
	}
	
	public int getFuncionario() {
		return listaFuncionario.getSelectedIndex(); 
	}
	
	public void atualizarListaCliente(List<Model.cliente> clientes) {
		listaCliente.removeAllItems();
		for(Model.cliente cliente: clientes) {
			listaCliente.addItem(cliente.getNome());
		}
	}
	
	public void atualizarListaFuncionario(List<Model.funcionario> funcionarios) {
		listaFuncionario.removeAllItems();
		for(Model.funcionario funcionario: funcionarios) {
			listaFuncionario.addItem(funcionario.getNome());
		}
	}
	

	public String getBorda() {
		return txtBorda.getText(); 
	}
	
	public String getRecheio() {
		return txtRecheio.getText(); 
	}
	public String getTamanho() {
		return txtTamanho.getText(); 
	}
	public String getMolho() {
		return txtMolho.getText(); 
	}
}
