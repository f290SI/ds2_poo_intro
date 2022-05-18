package model;

public abstract class Ave extends Animal{

    Ave(String nomeCientifico, String habitat, Integer fome, String urlImagem) {
        super(nomeCientifico, habitat, fome, urlImagem);
    }

    @Override
    public void emitirSom() {
        throw new RuntimeException("Metodo não implementado em classe base");
    }
    
}
