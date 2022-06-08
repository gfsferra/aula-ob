package exerc13;
import java.util.Scanner;

public class Aula12_midias {
    public static void main(String agrs[]){
        // Cria um vetor de elementos com objetos da classe Midia.
        Midia[] lista = new Midia[10];
        int opcao;
        // Preenchendo o vetor com CDs.
        for (int i=0; i < 2; i++){
            // Usuário escolhe se quer cadastrar CD ou DVD.
            System.out.println("Digite 1 para CD e 2 para DVD");
            Scanner in = new Scanner(System.in);
            opcao = in.nextInt();
            if (i == opcao) // Criar CD.
                lista[i] = new CD();
            else // Criar DVD.
                lista[i] = new DVD();
                lista[i].inserirDados();
        }
        // classe a que ele pertence (isto e, usando polimorfismo).
        for (int i=0; i < 2; i++)
            lista[i].printDados();
    }
}