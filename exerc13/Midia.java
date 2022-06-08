package exerc13;

import java.util.Scanner;
public class Midia
{
    private int codigo;
    private double preco;
    private String name;
    // Métodos para inserir valores nos campos.
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setName(String name){
        this.name = name;
    }
    // Métodos para retornar os valores contidos nos campos.
    public int getCodigo(){
        return this.codigo;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getName(){
        return this.name;
    }
    // Construtor sem parâmetros.
    public Midia(){
        this(0,0.0,"Nenhum");
    }
    // Construtor com parâmetros.
    public Midia(int codigo, double preco, String name){
        setCodigo(codigo);
        setPreco(preco);
        setName(name);
    }
    // Função para impressao dos dados do tipo.
    public String getTipo(){
        return "Midia: ";
    }
    // Função que retorna o conteúdo dos campos em forma de String.
    public String getDetalhes(){
        return "Codigo: " + getCodigo() + "\n" +
               "Preco: " + getPreco() + "\n" +
               "Nome: " + getName() + "\n";
    }
    // Função para impressao dos dados via getDetalhes().
    public void printDados(){
        String s = getTipo() + "\n" + getDetalhes() + "\n";
        System.out.println(s);
    }
    // Função para leitura dos dados via teclado.
    public void inserirDados(){
        Scanner in = new Scanner(System.in);
        // Leitura dos dados do teclado.
        System.out.println("\n Entre com o codigo: ");
        int cod = in.nextInt();
        System.out.println("\n Entre com o preco: ");
        double pre = in.nextDouble();
        in.nextLine(); // leitura do enter.
        System.out.println("\n Entre com o nome: ");
        String nam = in.nextLine();
        // Enviando os dados lidos para as funcoes set.
        setCodigo(cod);
        setPreco(pre);
        setName(nam);
    }
}