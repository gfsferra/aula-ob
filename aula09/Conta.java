package aula09;

import java.io.Console;

public class Conta{
    private int numero;
    private double saldo;

    public Conta(){
        System.out.println("Sua conta");
    }

    private void setNumero(int numero){
        if (numero < 0){
            System.out.println("[ERRO]Numero de conta invalido.");
        }
        else{
            this.numero = numero;
        }
    }

    private void setSaldo(double saldo){
        if (saldo < 0){
            System.out.println("[ERRO]Numero de saldo invalido.");
        }
        else{
            this.saldo = saldo;
        }
    }

    private int getNumero(){
        return numero;
    }

    private double getSaldo() {
        return saldo;
    }
    
    public void credito(){
        System.out.println("Por favor informe um valor ao credito!");;  
    }

    public void credito(double valor){
        
        this.saldo += valor;  
    }
    
    public void debito(){
        System.out.println("Por favor informe um valor ao debito!");;  
    }

    public void debito(double valor){
        if (this.saldo < valor){
            System.out.println("[ERRO]Operacao incapaz de ser realizada.");
        }  
        else{
            this.saldo -= valor;
        }
    }

    public void status(){
        System.out.println("Conta:" + this.numero);
        System.out.println("Saldo:" + this.saldo);
    }


    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setNumero(1);
        conta1.setSaldo(20000);
        conta1.status();
        conta1.debito(10000);
        conta1.debito();
        conta1.status();
        conta1.credito(777);
        conta1.credito();
        conta1.status();
        }

}
