package entites;

public class Animal {
    protected String nome;
    protected String especie;
    protected String corPredominate;
    protected String sexo;
    public Animal (String nome, String especie, String corPredominate, String sexo){
        this.nome=nome;
        this.especie=especie;
        this.corPredominate=corPredominate;
        this.sexo=sexo;
    }
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getCorPredominate() {
        return corPredominate;
    }

    public String getSexo() {
        return sexo;
    }
}
