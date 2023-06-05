package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

import Controller.lancheController;

public class cadastroCLancheView extends JFrame {
	
	private JLabel labelNome;
    private JTextField txtNome;
    private JLabel labelCpf;
    private JTextField txtCpf;
    private JLabel labelAniversario;
    private JTextField txtAniversario;
    private JButton btnCadastrar;

    public cadastroCLancheView(lancheController controller) {
        setTitle("Cadastro de Clientes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        labelNome = new JLabel("Nome:");
        txtNome = new JTextField(20);
        labelCpf = new JLabel("CPF:");
        txtCpf = new JTextField(20);
        labelAniversario = new JLabel("Aniversario:");
        txtAniversario = new JTextField(20);
        
        btnCadastrar = new JButton("Cadastrar");

        JPanel panel = new JPanel();
        panel.add(labelNome);
        panel.add(txtNome);
        panel.add(labelCpf);
        panel.add(txtCpf);
        panel.add(labelAniversario);
        panel.add(txtAniversario);
        panel.add(btnCadastrar);

        add(panel);

        pack();
        setLocationRelativeTo(null);
        
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                String aniversario = txtAniversario.getText();
                controller.cadastrarCliente(nome, cpf, aniversario);
                JOptionPane.showMessageDialog(null, "Cliente " + nome + " cadastrado com sucesso");
                dispose();
            }
        });
    }
    
    
	
}
