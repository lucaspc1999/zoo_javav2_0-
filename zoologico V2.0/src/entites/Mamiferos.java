package entites;

public class Mamiferos extends Animal{
    private String tipoPelagem;


    public Mamiferos (String nome, String especie, String corPredomiante,String sexo,String tipoPelagem){
        super( nome, especie, corPredomiante, sexo);
        this.tipoPelagem=tipoPelagem;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

}

