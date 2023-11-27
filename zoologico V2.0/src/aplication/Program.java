package aplication;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entites.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int idAnimal = 0;
        double escolha;
        do {
            System.out.println("---------------BEM VINDO---------------");
            System.out.println("----CENTRAL DE CADASTRO DE ANIMAIS-----");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.print("\n");
            System.out.println("Selecione a classe do animal: ");
            System.out.println("1 - MAMÍFEROS ");
            System.out.println("2 - AVES ");
            System.out.println("3 - RÉPTEIS ");
            System.out.println("4 - PEIXES ");
            System.out.println("5 - ANFÍBIOS ");
            System.out.print("Opção: ");
            int classe = sc.nextInt();

            switch (classe) {
                case 1:
                    cadastrarMamifero(idAnimal++);
                    break;
                case 2:
                    cadastrarAves(idAnimal++);
                    break;
                case 3:
                    cadastrarRepteis(idAnimal++);
                    break;
                case 4:
                    cadastrarPeixes(idAnimal++);
                    break;
                case 5:
                    cadastrarAnfibio(idAnimal++);
                    break;

            }
            System.out.println("Deseja cadastrar novo animal? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            escolha = sc.nextDouble();

        } while (escolha == 1);

    }
    private static void cadastrarMamifero(int idAnimal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_de_Mamiferos.txt", true))) {
            Scanner m = new Scanner(System.in);
            System.out.println("\n-------Cadastro de Mamíferos-------\n");
            System.out.println("Digite a espécie do animal: ");
            String especie = m.nextLine();
            System.out.println("Digite o nome do animal: ");
            String nome = m.nextLine();
            System.out.println("Digite a Cor Predominante do animal: ");
            String corPredominante = m.nextLine();
            System.out.println("Digite o sexo do animal: ");
            String sexo = m.nextLine();
            System.out.println("Digite a tipo de pelagem: ");
            String tipoPelagem = m.nextLine();

            Mamiferos newMamifero = new Mamiferos(especie,nome,corPredominante,sexo,tipoPelagem);

            escreverNoArquivo(writer, "Mamífero", idAnimal, newMamifero);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void cadastrarAves(int idAnimal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_de_Aves.txt", true))) {
            Scanner m = new Scanner(System.in);
            System.out.println("\n-------Cadastro de Aves-------\n");
            System.out.println("Digite o nome do animal: ");
            String nome = m.nextLine();
            System.out.println("Digite a espécie do animal: ");
            String especie = m.nextLine();
            System.out.println("Digite a Cor Predominante do animal: ");
            String corPredominante = m.nextLine();
            System.out.println("Digite o sexo do animal: ");
            String sexo = m.nextLine();
            System.out.println("Digite a cor do bico: ");
            String corDoBico = m.nextLine();
            System.out.println("Digite a quantidade média que a espécie põe: ");
            int qtdDeOvos = m.nextInt();

            Aves newAve = new Aves(especie,nome,corPredominante,sexo,corDoBico,qtdDeOvos);

            escreverNoArquivo(writer, "Ave", idAnimal, newAve);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void cadastrarRepteis(int idAnimal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_de_Repteis.txt", true))) {
            Scanner m = new Scanner(System.in);
            System.out.println("\n-------Cadastro de Répteis-------\n");
            System.out.println("Digite a espécie do animal: ");
            String especie = m.nextLine();
            System.out.println("Digite o nome do animal: ");
            String nome = m.nextLine();
            System.out.println("Digite a Cor Predominante do animal: ");
            String corPredominante = m.nextLine();
            System.out.println("Digite o sexo do animal: ");
            String sexo = m.nextLine();

            Repteis newReptil = new Repteis(especie,nome,corPredominante,sexo);

            escreverNoArquivo(writer, "Réptil", idAnimal, newReptil);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void cadastrarPeixes(int idAnimal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_de_Peixes.txt", true))) {
            Scanner m = new Scanner(System.in);
            System.out.println("\n-------Cadastro de Peixes-------\n");
            System.out.println("Digite a espécie do animal: ");
            String especie = m.nextLine();
            System.out.println("Digite o nome do animal: ");
            String nome = m.nextLine();
            System.out.println("Digite a Cor Predominante do animal: ");
            String corPredominante = m.nextLine();
            System.out.println("Digite o sexo do animal: ");
            String sexo = m.nextLine();
            Peixes newPeixe = new Peixes(especie,nome,corPredominante,sexo);

            escreverNoArquivo(writer, "Peixe", idAnimal, newPeixe);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void cadastrarAnfibio(int idAnimal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_de_Anfibios.txt", true))) {
            Scanner m = new Scanner(System.in);
            System.out.println("\n-------Cadastro de Anfíbios-------\n");
            System.out.println("Digite a espécie do animal: ");
            String especie = m.nextLine();
            System.out.println("Digite o nome do animal: ");
            String nome = m.nextLine();
            System.out.println("Digite a Cor Predominante do animal: ");
            String corPredominante = m.nextLine();
            System.out.println("Digite o sexo do animal: ");
            String sexo = m.nextLine();
            Anfibios newAnfibio = new Anfibios(especie,nome,corPredominante,sexo);

            escreverNoArquivo(writer, "Anfíbio", idAnimal, newAnfibio);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void escreverNoArquivo(BufferedWriter writer, String tipo, int idAnimal, Animal animal) throws IOException {
        writer.write(tipo +"\n");
        writer.write("ID DO ANIMAL: " + idAnimal + "\n");
        writer.write("Espécie: " + animal.getEspecie() + "\n");
        writer.write("Nome: " + animal.getNome() + "\n");
        writer.write("Cor Predominante: " + animal.getCorPredominate() + "\n");
        writer.write("Sexo: " + animal.getSexo() + "\n");

        if (animal instanceof Aves) {
            writer.write("Cor do Bico: " + Aves.getCorDoBico() + "\n");
            writer.write("Quantidade Média de Ovos: " + Aves.getQntDeOvos() + "\n");
        }

        writer.write("\n");
    }

}
