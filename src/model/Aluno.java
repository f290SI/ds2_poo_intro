package model;

import java.util.Scanner;

public class Aluno {
    // Classe é uma estrutura que define atributos e compotamentos
    
    // Atrbituos [ra, nome, email]
    private String ra;
    private String nome;
    private String email;

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

    private boolean isEmailValido(String email) {
        return email.contains("@");
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(isEmailValido(email)) {
            this.email = email;
            return;
        }
        System.out.println("É necessário um e-mail válido com o caracter @.");
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno [email=" + email + ", nome=" + nome + ", ra=" + ra + "]";
    }

}
