package model;

import java.util.Scanner;

public class Aluno {
    // Classe é uma estrutura que define atributos e compotamentos
    
    // Atrbituos [ra, nome, email]
    public String ra;
    public String nome;
    public String email;

    // Comportamentos 
    // Padronizar a criação de objetos Aluno
    public Aluno(String pRa, String pNome, String pEmail) {
        this.ra = pRa;
        this.nome = pNome;
        this.email = pEmail;
    }

    // Default Constructor
    public Aluno(){}

    // Chamada 09-05-22 [Ricardo, Gabriel, David, Vitor, Willian, Rafael, Gustavo, Luiza Carlos, Jose Carlos, Carlos, Felipe]

    public static Aluno instanciaComLeituraDeDadosViaConsole() {
        Aluno aluno = new Aluno();
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o RA:");
        aluno.ra = in.nextLine();
        System.out.println("Digite o nome:");
        aluno.nome = in.nextLine();
        System.out.println("Digite o E-mail:");
        aluno.email = in.nextLine();
        in.close();
        return aluno;
    }

    public void exibirDados() {
        System.out.println("\nRA: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
    }

}
