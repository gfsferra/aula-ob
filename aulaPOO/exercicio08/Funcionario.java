package exercicio08;
public class Funcionario {
    private int matricula;
    private String nome;
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void almocar(String refeicao){
        System.out.println("O Funcionario almoçou um(a) "+refeicao);
    }
}
