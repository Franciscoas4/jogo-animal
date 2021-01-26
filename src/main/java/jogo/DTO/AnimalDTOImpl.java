package jogo.DTO;

import java.util.ArrayList;
import java.util.List;

import jogo.entity.Animal;

public class AnimalDTOImpl {

	private List<Animal> animais;

    public AnimalDTOImpl() {
    	animais = new ArrayList<>();
        Animal a = new Animal();
        a.setId(Integer.valueOf(1));
        a.setAtributo("vive na àgua");
        a.setRespostaSim("Tubarão");
        a.setRespostaNao("Macaco");
        a.setFilhoRaiz(Integer.valueOf(0));;
        animais.add(a);
	}

    public void salvar(Animal animal)
    {
        animais.add(animal);
    }

    public List<Animal> getAnimais()
    {
        return animais;
    }

    public void setAnimais(List<Animal> animais)
    {
        this.animais = animais;
    }
	
	
}
