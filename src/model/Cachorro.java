package model;

public class Cachorro extends Animal{

    Cachorro(String nomeCientifico, String habitat, Integer fome, String urlImagem) {
        super(nomeCientifico, habitat, fome, urlImagem);
    }

    @Override
    public void emitirSom() {
        System.out.println("Woof");        
    }

}
