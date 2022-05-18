package model;

public abstract class Animal {
    
    private String nomeCientifico;
    private String habitat;
    private Integer fome;
    private String urlImagem;

    Animal(String nomeCientifico, String habitat, Integer fome, String urlImagem) {
        this.nomeCientifico = nomeCientifico;
        this.habitat = habitat;
        this.fome = fome;
        this.urlImagem = urlImagem;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Integer getFome() {
        return fome;
    }

    public void setFome(Integer fome) {
        this.fome = fome;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public abstract void emitirSom();    

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [fome=" + fome + ", habitat=" + habitat + ", nomeCientifico=" + nomeCientifico + ", urlImagem="
                + urlImagem + "]";
    }

    
}
