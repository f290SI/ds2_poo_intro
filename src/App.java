import java.util.Scanner;

import model.Aluno;
import model.Animal;
import model.Gato;

public class App {

    public static void main(String[] args) throws Exception {

        Aluno aluno1 = new Aluno("1", "Pedro", "pedro@gmail.com");
        Aluno aluno2 = new Aluno("2", "Antonio", "antonio@gmail.com");
        Aluno aluno3 = new Aluno("3", "Matheus", "matheus@gmail.com");

        // System.out.println(aluno1);
        
        // aluno1.exibirDados();
        // aluno2.exibirDados();
        // aluno3.exibirDados();
     
        Gato gato = new Gato("Gato Cientifico", "urbano", 5, "http://photos.google.com/cat/cat1.png");
        gato.emitirSom();
        System.out.println(gato);

    }
}
