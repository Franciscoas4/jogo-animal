package jogo.service;

import jogo.DTO.AnimalDTOImpl;
import jogo.entity.Animal;
import jogo.view.InterfaceUsuario;

public class VerificaAnimalService {

	public VerificaAnimalService() {
    }

    public void inicia() {
    	InterfaceUsuario mensagem = new InterfaceUsuario();
        VerificaRespostaService funcoes = new VerificaRespostaService();
        AnimalDTOImpl dao = new AnimalDTOImpl();
        boolean controle = false;
        int indice = 0;
        int respostaInicio;
        do
        {
            respostaInicio = mensagem.inicio();
            if(respostaInicio == 0)
            {
                do
                {
                    Animal animal = (Animal)dao.getAnimais().get(indice);
                    int respostaPergunta = mensagem.pergunta(animal);
                    Animal filho = funcoes.retornaFilho(dao.getAnimais(), (Animal)dao.getAnimais().get(indice), respostaPergunta);
                    if(filho == null)
                    {
                        int respostaEhAnimal = mensagem.perguntaSeEh(animal, respostaPergunta);
                        if(respostaEhAnimal == 0)
                        {
                            mensagem.mostraMensagem("Eu venci!!!");
                            controle = true;
                        } else
                        {
                            dao.salvar(funcoes.cadastraNovo(funcoes.retornaMaiorId(dao.getAnimais()), animal, respostaPergunta, indice));
                            controle = true;
                        }
                    } else
                    {
                    	indice = dao.getAnimais().indexOf(filho);
                    }
                } while(!controle);
                indice = 0;
                controle = false;
            }
        } while(respostaInicio == 0);
    }
}
