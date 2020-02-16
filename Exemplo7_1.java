package capitulo7;

import javax.swing.JOptionPane;

public class Exemplo7_1 {

	public static void main(String[] args) {
		int opcao;
		opcao = Integer.parseInt(JOptionPane.showInputDialog(
		    "Escolha a sua op��o:\n" + "1 - Adi��o\n" + "2 - Subtra��o\n" + "3 - Multiplica��o\n" + "4 - Divis�o\n"));
		switch (opcao) {
		case 1:
			modAdicao();
			break;
		case 2:
			modSubtracao();
			break;
		case 3:
			modMultiplicacao();
			break;
		case 4:
			modDivisao();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Fim do Programa");
			break;
		}
	}

	static void modAdicao() {
		double v1, v2, res;
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		res = v1 + v2;
		JOptionPane.showMessageDialog(null, "Soma = " + res);

	}

	static void modSubtracao() {
		double v1, v2, res;
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		res = v1 - v2;
		JOptionPane.showMessageDialog(null, "Subtra��o = " + res);

	}

	static void modMultiplicacao() {
		double v1, v2, res;
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		res = v1 * v2;
		JOptionPane.showMessageDialog(null, "Multiplica��o = " + res);

	}

	static void modDivisao() {
		double v1, v2, res;
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		res = v1 / v2;
		JOptionPane.showMessageDialog(null, "Divis�o = " + res);

	}

}
