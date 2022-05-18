package model;

public class Aguia extends Ave implements Voavel, Patrulhavel{

    Aguia(String nomeCientifico, String habitat, Integer fome, String urlImagem) {
        super(nomeCientifico, habitat, fome, urlImagem);
    }

    @Override
    public void emitirSom() {
        System.out.println("IAAAHHHHHH");
    }

    @Override
    public void voar() {
        System.out.println("Aguia voando!");
        
    }

    @Override
    public void patrulhar() {
        System.out.println("Aguia patrulhando!");
        
    }
    
}
