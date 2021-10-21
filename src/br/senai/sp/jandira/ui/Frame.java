package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.contas.ValorImc;

public class Frame {

	public void criarTela() {

		JFrame frame = new JFrame();
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculo de IMC");
		frame.setLayout(null);

		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Cálcule o seu IMC");
		lblTitulo.setBounds(25, 20, 200, 35);
		lblTitulo.setFont(new Font("Serif", Font.BOLD, 25));
		lblTitulo.setForeground(Color.blue);

		JLabel lblPeso = new JLabel();
		lblPeso.setText("Insira seu peso: ");
		lblPeso.setFont(new Font("Serif", Font.PLAIN, 15));
		lblPeso.setBounds(25, 65, 100, 20);

		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(130, 65, 170, 20);

		JLabel lblTamanho = new JLabel();
		lblTamanho.setText("Insira seu tamanho: ");
		lblTamanho.setFont(new Font("Serif", Font.PLAIN, 15));
		lblTamanho.setBounds(25, 90, 120, 20);

		JTextField txtTamanho = new JTextField();
		txtTamanho.setBounds(150, 90, 150, 20);

		Color cinza = new Color(200, 200 ,200);
		JButton btnCalcular = new JButton();
		btnCalcular.setText("CALCULAR");
		btnCalcular.setFont(new Font("Serif", Font.PLAIN, 30));
		btnCalcular.setBackground(cinza);
		btnCalcular.setBounds(25, 150, 350, 35);

		JLabel lblResultado = new JLabel();
		lblResultado.setText("Resultados: ");
		lblResultado.setFont(new Font("Serif", Font.BOLD, 20));
		lblResultado.setBounds(25, 220, 120, 20);

		JLabel lblValorImc = new JLabel();
		lblValorImc.setText("valor do IMC: ");
		lblValorImc.setFont(new Font("Serif", Font.PLAIN, 15));
		lblValorImc.setBounds(25, 295, 140, 20);
		
		JLabel lblImc = new JLabel();
		lblImc.setFont(new Font("Serif", Font.PLAIN, 25));
		lblImc.setBounds(160, 295, 120, 20);

		JLabel lblStatus = new JLabel();
		lblStatus.setText("Status do seu IMC: ");
		lblStatus.setFont(new Font("Serif", Font.PLAIN, 15));
		lblStatus.setBounds(25, 345, 140, 40);
		
		JLabel lblResultadoStatus = new JLabel();
		lblResultadoStatus.setFont(new Font("Serif", Font.PLAIN, 25));
		lblResultadoStatus.setBounds(160, 345, 200, 40);

		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String peso = txtPeso.getText();
				String tamanho = txtTamanho.getText();
				double valorPeso = Double.valueOf(peso);
				double valorTamanho = Double.valueOf(tamanho);
				
				ValorImc calcImc = new ValorImc();
				
				calcImc.CalcularImc(valorPeso , valorTamanho);
				

				
				lblImc.setText(String.valueOf(calcImc.getImc()));
				lblResultadoStatus.setText(calcImc.getStatus());
				lblImc.setForeground(Color.GREEN);
				lblResultadoStatus.setForeground(Color.green);
				
				
				
				
			}
		});
		
		frame.getContentPane().add(lblResultadoStatus);
		frame.getContentPane().add(lblImc);
		frame.getContentPane().add(btnCalcular);
		frame.getContentPane().add(txtTamanho);
		frame.getContentPane().add(txtPeso);
		frame.getContentPane().add(lblStatus);
		frame.getContentPane().add(lblValorImc);
		frame.getContentPane().add(lblResultado);
		frame.getContentPane().add(lblPeso);
		frame.getContentPane().add(lblTamanho);
		frame.getContentPane().add(lblTitulo);
		frame.setVisible(true);

	}

}
