package jogo.view;

import javax.swing.JOptionPane;

import jogo.entity.Animal;


public class InterfaceUsuario {

	public InterfaceUsuario() {
	}

	public int inicio() {
		return JOptionPane.showConfirmDialog(null, "Pense em um animal. Vou tentar adivinhar", "Jogo dos animais", 2);
	}

	public int pergunta(Animal a) {
		return JOptionPane.showConfirmDialog(null, (new StringBuilder("O animal que você pensou "))
				.append(a.getAtributo()).append("?").toString(), "Informe", 0);
	}

	public int perguntaSeEh(Animal a, int simOuNao) {
		if (simOuNao == 0) {
			return JOptionPane.showConfirmDialog(null, (new StringBuilder("O animal que você pensou é "))
					.append(a.getRespostaSim()).append("?").toString(), "Informe", 0);
		} else {
			return JOptionPane.showConfirmDialog(null, (new StringBuilder("O animal que você pensou é "))
					.append(a.getRespostaNao()).append("?").toString(), "Informe", 0);
		}
	}

	public String entrada(Animal a, String mensagem) {
		String valor;
		do {
			valor = JOptionPane.showInputDialog(null, mensagem);
			if (valor == null) {
				mostraMensagem("INFORME ALGUM VALOR!");
			}
		} while (valor == null);
		return valor;
	}

	public void mostraMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
