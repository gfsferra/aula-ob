package exercicio08;

public class Midia {
    int codigo;
    double preco;
    String titulo;

    public Midia(){

    }

    public Midia(int codigo, double preco, String titulo){
        this.codigo = codigo;
        this.preco = preco;
        this.titulo = titulo;
    }

    public String getTipo(){
        return "Midia";
    }

    public String getDetalhes(){
        return "Codigo: " + this.codigo + "\nPreco: " + this.preco + "\nTitulo: " + this.titulo;
    }

    public void printDados(){
        System.out.println(this.getDetalhes());
    }

    public void InserirDados(){
        System.out.println("Inserir dados da Midia");
        System.out.println("Codigo: ");
        this.codigo = Integer.parseInt(System.console().readLine());
        System.out.println("Preco: ");
        this.preco = Double.parseDouble(System.console().readLine());
        System.out.println("Titulo: ");
        this.titulo = System.console().readLine();
    }

}
