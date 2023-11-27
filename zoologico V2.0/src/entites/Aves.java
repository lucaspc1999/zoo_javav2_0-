package entites;

public class Aves extends Animal{
    private static String corDoBico;
    private static int qntDeOvos;

    public Aves (String nome, String especie, String corPredomiante,String sexo, String corDoBico, int qntDeOvos){
        super( nome, especie, corPredomiante, sexo);
        this.corDoBico=corDoBico;
        this.qntDeOvos=qntDeOvos;
    }

    public static String getCorDoBico() {
        return corDoBico;
    }
    public static int getQntDeOvos() {
        return qntDeOvos;
    }
}
