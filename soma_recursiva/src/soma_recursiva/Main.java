package soma_recursiva;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String input;
		int numero;
		int resultado;
		
		input = JOptionPane.showInputDialog("Informe a quantidade de numeros NATURAIS que serão somados:");
		numero = Integer.parseInt(input);
		
		resultado = SomaRecursiva.somar(numero);
		
		JOptionPane.showMessageDialog(null, "A soma dos " + numero + " primeiros numeros naturais é: " + resultado );
	}

}
