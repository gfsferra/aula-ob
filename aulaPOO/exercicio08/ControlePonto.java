package exercicio08;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlePonto {
    public void registraEntrada(Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        System.out.println("ENTRADA: "+f.getMatricula()+"-"+f.getNome());
        System.out.println("DATA: "+sdf.format(agora));
    }
    public void registraSaida(Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        System.out.println("SAIDA: "+f.getMatricula()+"-"+f.getNome());
        System.out.println("DATA: "+sdf.format(agora));
    }
}
