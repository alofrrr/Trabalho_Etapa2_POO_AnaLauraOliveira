package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

import Controller.pizzaController;

public class cadastroFPizzaView extends JFrame {

	private JLabel lblNome;
	private JTextField txtNome;
	private JLabel lblCpf;
	private JTextField txtCpf;
	private JLabel lblSalario;
	private JTextField txtSalario;
	private JLabel lblCargo;
	private JTextField txtCargo;
	
	
	private JButton btnCadastrar;
	

	public cadastroFPizzaView(pizzaController controller) {
		setTitle("Cadastro de Funcionarios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


		lblNome = new JLabel("Nome:");
		txtNome = new JTextField(20);
		lblCpf = new JLabel("CPF:");
		txtCpf = new JTextField(20);
		lblSalario = new JLabel("Salario:");
		txtSalario = new JTextField(20);		
		lblCargo = new JLabel("Cargo");
		txtCargo = new JTextField(20);
		btnCadastrar = new JButton("Cadastrar");

		JPanel panel = new JPanel();
		panel.add(lblNome);
		panel.add(txtNome);
		panel.add(lblCpf);
		panel.add(txtCpf);
		panel.add(lblCargo);
		panel.add(txtCargo);
		panel.add(lblSalario);
		panel.add(txtSalario);
		panel.add(btnCadastrar);

		add(panel);

		pack();
		setLocationRelativeTo(null);

		btnCadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				String cargo = txtCargo.getText();
				double salario = Double.parseDouble(txtSalario.getText());
				controller.cadastrarFuncionario(nome, cpf, salario, cargo);
				JOptionPane.showMessageDialog(null, "Funcionario " + nome + " cadastrado com sucesso!");
				dispose();
			}
		});
	}

}
