package jogo.service;

import java.util.Iterator;
import java.util.List;

import jogo.entity.Animal;
import jogo.view.InterfaceUsuario;


public class VerificaRespostaService {

	public VerificaRespostaService() {
    }

    public Animal retornaFilho(List<Animal> animais, Animal a, int respostaPergunta)
    {
        for(Iterator<Animal> iterator = animais.iterator(); iterator.hasNext();)
        {
            Animal animal = (Animal)iterator.next();
            if(animal.getIdRaiz() == a.getId() && animal.getFilhoRaiz().intValue() == respostaPergunta)
            {
                return animal;
            }
        }

        return null;
    }

    public int retornaMaiorId(List<Animal> animais)
    {
        return animais.size() + 1;
    }

    public Animal cadastraNovo(int id, Animal animal, int respostaPergunta, int flag)
    {
        InterfaceUsuario mensagem = new InterfaceUsuario();
    	Animal novoAnimal = new Animal();
        novoAnimal.setId(Integer.valueOf(id));
        novoAnimal.setRespostaSim(mensagem.entrada(animal, "Qual animal você pensou?"));
        novoAnimal.setIdRaiz(animal.getId());
        novoAnimal.setFilhoRaiz(Integer.valueOf(respostaPergunta));
        if(respostaPergunta == 0)
        {
            novoAnimal.setRespostaNao(animal.getRespostaSim());
            novoAnimal.setAtributo(mensagem.entrada(animal, (new StringBuilder("Um(a) ")).append(novoAnimal.getRespostaSim()).append(" ________ mas um(a) ").append(animal.getRespostaSim()).append(" n\343o.").toString()));
        } else
        {
            novoAnimal.setRespostaNao(animal.getRespostaNao());
            novoAnimal.setAtributo(mensagem.entrada(animal, (new StringBuilder("Um(a) ")).append(novoAnimal.getRespostaSim()).append(" ________ mas um(a) ").append(animal.getRespostaNao()).append(" n\343o.").toString()));
        }
        return novoAnimal;
    }
}
