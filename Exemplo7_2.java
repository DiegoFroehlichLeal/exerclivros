package capitulo7;

import javax.swing.JOptionPane;

public class Exemplo7_2 {
	//Fatorial

	public static void main(String[] args) {
		int numero, fat;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Qual � o n�mero?: "));
		fat = fatorial(numero);
		JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " � " + fat);

	}

	static int fatorial(int numero) {
		int f = 1;
		for (int i = 1; i <= numero; i++)
			f = f * i;
		return f;

	}
}
// quando o numero for muito grande ser� gerado o valor 0.