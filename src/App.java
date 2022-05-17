import java.util.Scanner;

import model.Aluno;

public class App {

    public static void main(String[] args) throws Exception {

        Aluno aluno1 = new Aluno("1", "Pedro", "pedro@gmail.com");
        Aluno aluno2 = new Aluno("2", "Antonio", "antonio@gmail.com");
        Aluno aluno3 = new Aluno("3", "Matheus", "matheus@gmail.com");
        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();

        Aluno.instanciaComLeituraDeDadosViaConsole().exibirDados();;
        
    }
}
