package com.calculadora.swing;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		//variaveis
		int Break; 
		double Num1, Num2;
		Object operacao;
		Object[] Operadores = {"+", "-", "x", "÷"};
		
		//algoritimo
		do {
			
			Num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: ").replace(",", "."));
			Num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: ").replace(",", "."));
			
			operacao = JOptionPane.showInputDialog(null, "Qual operação deseja efetuar? ", "operação", JOptionPane.INFORMATION_MESSAGE, null, Operadores, Operadores[0]);
			
			if (operacao == Operadores[0]) {
				JOptionPane.showMessageDialog(null, Num1+" + "+Num2+" = "+ (Num1+Num2));
			} else if (operacao == Operadores[1]) {
				JOptionPane.showMessageDialog(null, Num1+" - "+Num2+" = "+ (Num1-Num2));
			}else if (operacao == Operadores[2]) {
				JOptionPane.showMessageDialog(null, Num1+" x "+Num2+" = "+ (Num1*Num2));
			}else {
				JOptionPane.showMessageDialog(null, Num1+" ÷ "+Num2+" = "+ (Num1/Num2));	
			}
			
			Break = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		} while(Break == 0);
		System.exit(0);	
	}
}
