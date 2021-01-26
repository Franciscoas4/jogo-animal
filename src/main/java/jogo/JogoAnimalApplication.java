package jogo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jogo.service.VerificaAnimalService;

@SpringBootApplication
public class JogoAnimalApplication {

	public static void main(String[] args) {
		VerificaAnimalService logica = new VerificaAnimalService();
        logica.inicia();
		
	}

}
