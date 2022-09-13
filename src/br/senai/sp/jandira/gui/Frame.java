package br.senai.sp.jandira.gui;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import br.senai.sp.jandira.model.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JButton;

public class Frame {
	 
	public String titulo;
	public int largura;
	public int altura;
	
	public Color cinza = new Color(224, 224, 224);
	public Color vermelho  = new Color(204, 0, 0);
	public Color verde = new Color(126, 245, 141);
	public Color amarelo = new Color(247, 237, 125);
	public Color corPainel = new Color(230, 217, 200);
	public Font fontTitulo = new Font ("Arial", Font.BOLD, 20);
	public Font fontResultado = new Font ("Arial", Font.BOLD, 15);
	public Font fontButton = new Font("@Microsoft YaHei UI", Font.BOLD, 15);
	public Font fontFunc = new Font ("@SimSun-ExtB", Font.ITALIC, 20);
	public Font fontLabel = new Font ("Bahnschrift SemiCondensed", Font.ITALIC, 11);
	
  public void criarTela() {
	
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		Container painel = tela.getContentPane();
		painel.setBackground(cinza);
		
//		JLabel labelTitulo = new JLabel();
//		labelTitulo.setText("Tabuada");
//		labelTitulo.setBounds(22, 10, 100, 30);
		
		// Componentes da Janela
		
		JLabel imagem = new JLabel();
		imagem.setIcon(new ImageIcon("src/br/senai/sp/jandira/img/cerebro.png"));
		imagem.setBounds(20, 25, 300, 30);

		JLabel labelSubTitulo = new JLabel();
		labelSubTitulo.setText("Tabuada 1.0");
		labelSubTitulo.setBackground(vermelho);
		labelSubTitulo.setFont(fontTitulo);
		labelSubTitulo.setBounds(52, 20, 200, 30);
	
		JLabel labelRecad = new JLabel();
		labelRecad.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule a tabuada que desejar em segundos!");
		labelRecad.setBackground(vermelho);
		labelRecad.setFont(fontLabel);
		labelRecad.setBounds(65, 35, 500, 30);
		
		JLabel labelMulti = new JLabel();
		labelMulti.setText("Multiplicando:");
		labelMulti.setFont(fontFunc);
		labelMulti.setBounds(100, 100, 200, 30);
		
		JTextField textFildMultiplicador = new JTextField();
		textFildMultiplicador.setBounds(230, 100, 100, 30);
		
		JLabel labelMin = new JLabel();
		labelMin.setText("Mín. Multiplicador:");
		labelMin.setFont(fontFunc);
		labelMin.setBounds(60, 150, 200, 30);
		
		JTextField textFildMinMultipli = new JTextField();
		textFildMinMultipli.setBounds(230, 150, 100, 30);
		
		JLabel labelMax = new JLabel();
		labelMax.setText("Máx. Multiplicador:");
		labelMax.setFont(fontFunc);
		labelMax.setBounds(55, 200, 200, 30);
		
		JTextField textFildMaxMultipli = new JTextField();
		textFildMaxMultipli.setBounds(230, 200, 100, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setFont(fontButton);
		buttonCalcular.setBackground(verde);
		buttonCalcular.setBounds(60, 265, 150, 30);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setFont(fontButton);
		buttonLimpar.setBackground(amarelo);
		buttonLimpar.setBounds(230, 265, 100, 30);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultados:");
		labelResultado.setFont(fontResultado);
		labelResultado.setBounds(25, 330, 100, 30);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(30, 370, 350, 400);
		JList <Object> listagem = new JList<> ();
		
		//Adicionar os comandos na Janela 
	
		painel.add(imagem);
		painel.add(labelSubTitulo);
		painel.add(labelRecad);
		painel.add(labelMulti);
		painel.add(labelMin);
		painel.add(labelMax);
		painel.add(labelResultado);
		
		painel.add(textFildMultiplicador);
		painel.add(textFildMinMultipli);
		painel.add(textFildMaxMultipli);
		
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		
		painel.add(scroll);
		painel.add(listagem);
		
		tela.setVisible(true);
		
		//Não deixar o Usuário colocar caracteres, só números
	
		 textFildMultiplicador.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textFildMultiplicador.setText(textFildMultiplicador.getText().replaceAll("[^0-9]", ""));
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		 
		 textFildMinMultipli.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textFildMinMultipli.setText(textFildMinMultipli.getText().replaceAll("[^0-9]", ""));
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		 
		 textFildMaxMultipli.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					textFildMaxMultipli.setText(textFildMaxMultipli.getText().replaceAll("[^0-9]", ""));
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			 
		
		 //Fazer o botão Calcular Fncionar 
		 
		 buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(textFildMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(tela, "Multiplicador é OBRIGATÓRIO!!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
					textFildMultiplicador.requestFocus();
					
				}else if (textFildMinMultipli.getText().isEmpty()) {
					JOptionPane.showMessageDialog(tela, "O Mínimo Multiplicador é OBRIGATÓRIO!!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
					textFildMinMultipli.requestFocus();				
					
				}else if (textFildMaxMultipli.getText().isEmpty()) {
					JOptionPane.showMessageDialog(tela, "O Máximo Multiplicador é OBRIGATÓRIO!!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
					textFildMaxMultipli.requestFocus();				
					
				} else {
					Tabuada tabuada = new Tabuada();
					tabuada.multiplicador = Integer.parseInt(textFildMultiplicador.getText());
					tabuada.maximoMultiplicador = Integer.parseInt(textFildMaxMultipli.getText());
					tabuada.minimoMultiplicador = Integer.parseInt(textFildMinMultipli.getText());
					
				  if(tabuada.maximoMultiplicador < tabuada.minimoMultiplicador) {
					JOptionPane.showMessageDialog(tela, "O Multiplicador Mínimo deve ser MENOR que o Multiplicador Máximo!!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
					textFildMinMultipli.setText("");
					textFildMaxMultipli.setText("");
					
				  } else {
					  
					  listagem.setListData(tabuada.getTabuada());
					  scroll.getViewport().add(listagem);
					  
				  }
					
				}
				
			}});
		 
		 //Fazer o botão Limpar Fncionar 
	
		 buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textFildMultiplicador.setText("");
				textFildMaxMultipli.setText("");
				textFildMinMultipli.setText("");
				
				String[] limpar = {""};
				listagem.setListData(limpar);
				
				ListModel<Object> model = new DefaultListModel<>();
				listagem.setModel(model);
				
			}
		});
}
}