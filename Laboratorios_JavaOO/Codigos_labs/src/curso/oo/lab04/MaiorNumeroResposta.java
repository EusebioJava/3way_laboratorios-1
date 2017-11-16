package curso.oo.lab04;
//Programa para determinar o menor numero
import javax.swing.JOptionPane;

public class MaiorNumeroResposta {

	public static void main(String[] args) {

		int[] num = new int[10];
		int contador;
		// todo 1 - altere o nome para facilitar na leitura para menorNumero - Utilize o refactor da IDE (PeÃ§a ajuda)
		int menorNumero = 0;
		int numerostotal = 3;

		// Pede ao usuário para digitar números
		
		for (contador = 0; contador < numerostotal; contador++) {

			num[contador] = Integer.parseInt(JOptionPane.showInputDialog("Entre com os números até: " + numerostotal + " no total"));

            // todo 2 - dica: verifique esta condiÃ§Ã£o
			if (( contador == 0 ) || ( num[contador] < menorNumero ))
				menorNumero = num[contador];
		}

        // todo 3 - Altere para mostrar o novo resultado
        // Objetivo: Mostrar o menor numero digitado
		JOptionPane.showMessageDialog(null, "O Menor número é: " + menorNumero);
	}

}
