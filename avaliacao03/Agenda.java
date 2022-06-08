package aula10;

import java.util.ArrayList; // importa a classe ArrayList

public class Agenda {
    private int index = 1;
    private ArrayList<Pessoa> pessoas;
    private Pessoa pessoa;

    public Agenda() {
        this.pessoas = new ArrayList<>();
    }

    public void armazenaPessoa(String nome, int idade, double altura) {
        if (pessoas.size() != 10) {
            this.pessoa = new Pessoa(nome, idade, altura);
            pessoas.add(this.pessoa);
        } else
            System.out.println("Sem espaços para armazenar mais pessoas." + "\n");
    }

    public void removePessoa(String nome) {
        if (pessoas.size() != 0) {
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getNome().equalsIgnoreCase(nome)) {
                    pessoas.remove(pessoa);
                    System.out.println(pessoa.getNome() + " removido(a)!");
                    return;
                }
            }
            System.out.println("Não foi encontrada nenhuma pessoa com o nome " + pessoa.getNome());
        } else
            System.out.println("Agenda vazia!" + "\n");
    }

    public void buscaPessoa(String nome) {
        if (pessoas.size() != 0) {
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nAltura: " + pessoa.getAltura() + "\n");
                    return;
                }
            }
            System.out.println("Pessoa perdida (não foi encontrada)!" + "\n");
        }
        else
            System.out.println("Agenda vazia!" + "\n");
    }

    public void imprimePessoa(int i) {
        if (pessoas.size() != 0) {
            for (Pessoa pessoa : pessoas) {
                if (index == i) {
                    System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nAltura: " + pessoa.getAltura() + "\n");
                    return;
                }
                index++;
            }
            System.out.println(pessoa.getNome() + " não consta na Agenda!" + "\n");
        }
        else
            System.out.println("Agenda vazia!" + "\n");

    }

    public void imprimeAgenda() {
        if (pessoas.size() != 0) {
            for (Pessoa pessoa : pessoas) {
                System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nAltura: " + pessoa.getAltura() + "\n");
            }
        } else
            System.out.println("Agenda vazia!" + "\n");
    }
}
