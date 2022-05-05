package exercicio08;

public class CD extends Midia {
    int nMusicas;
    int codigo;
    double preco;
    String nome;
    
    public CD(){
        System.out.println("Inserir dados do CD");
    }

    public CD(int c, int m, double p, String s){
        this.codigo = c;
        this.nMusicas = m;
        this.preco = p;
        this.nome = s;
    }

    public String getTipo(){
        return "CD";
    }

    public String getDetalhes(){
        return "Codigo: " + this.codigo + "\nPreco: " + this.preco + "\nNome: " + this.nome + "\nNumero de Musicas: " + this.nMusicas;
    }

    public void setMusicas(int m){
        this.nMusicas = m;
    }

    public void inserirDados(){
        System.out.println("Inserir dados do CD");
        System.out.println("Codigo: ");
        this.codigo = Integer.parseInt(System.console().readLine());
        System.out.println("Preco: ");
        this.preco = Double.parseDouble(System.console().readLine());
        System.out.println("Nome: ");
        this.nome = System.console().readLine();
        System.out.println("Numero de Musicas: ");
        this.nMusicas = Integer.parseInt(System.console().readLine());
    }
}
