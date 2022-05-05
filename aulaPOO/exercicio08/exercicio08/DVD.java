package exercicio08;

public class DVD {
    int nFaixas;
    int codigo;
    double preco;
    String nome;

    public DVD(){
        System.out.println("Inserir dados do DVD");
    }

    public DVD(int c, int f, double p, String s){
        this.codigo = c;
        this.nFaixas = f;
        this.preco = p;
        this.nome = s;
    }

    public String getTipo(){
        return "DVD";
    }

    public String getDetalhes(){
        return "Codigo: " + this.codigo + "\nPreco: " + this.preco + "\nNome: " + this.nome + "\nNumero de Faixas: " + this.nFaixas;
    }

    public void setFaixas(int f){
        this.nFaixas = f;
    }

    public void inserirDados(){
        System.out.println("Inserir dados do DVD");
        System.out.println("Codigo: ");
        this.codigo = Integer.parseInt(System.console().readLine());
        System.out.println("Preco: ");
        this.preco = Double.parseDouble(System.console().readLine());
        System.out.println("Nome: ");
        this.nome = System.console().readLine();
        System.out.println("Numero de Faixas: ");
        this.nFaixas = Integer.parseInt(System.console().readLine());
    }

    public void printDados(){
        System.out.println(this.getDetalhes());
    }
}
