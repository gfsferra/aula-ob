public class avaliacao02{
    private String nome;
    private String nascimento;
    private double altura;

    public RA618608_av_02(){
        this.nome = "";
        this.nascimento = "";
        this.altura = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public String getNascimento(){
        return nascimento;
    }

    public double getAltura(){
        return altura;
    }

    public void status(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nascimento: " + this.nascimento);
        System.out.println("Altura: " + this.altura);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public static void main(String[] args) {
        RA618608_av_02 pessoa = new RA618608_av_02();
        RA618608_av_02 pessoa2 = new RA618608_av_02();
        RA618608_av_02 pessoa3 = new RA618608_av_02();
        pessoa.setNome("Joao");
        pessoa.setNascimento("01/01/2000");
        pessoa.setAltura(1.80);
        pessoa.status();
        pessoa2.setNome("Gabriel Sferra");
        pessoa2.setNascimento("26/04/2003");
        pessoa2.setAltura(1.90);
        pessoa2.status();
        pessoa3.status();
    }
}
