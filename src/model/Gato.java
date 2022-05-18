package model;

public class Gato extends Animal {

    public Gato(String nomeCientifico, String habitat, 
    Integer fome, String urlImagem) {
        super(nomeCientifico, habitat, fome, urlImagem);
    }

    @Override
    public void emitirSom() {
        System.out.println("Meow!");
    }
    
}
