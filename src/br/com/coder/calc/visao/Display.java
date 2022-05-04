package br.com.coder.calc.visao;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.coder.calc.modelo.Memoria;
import br.com.coder.calc.modelo.MemoriaObservador;

import java.awt.*;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private JLabel label;

	public Display() {
		Memoria.getInstacia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstacia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		
		add(label);

	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}

}
