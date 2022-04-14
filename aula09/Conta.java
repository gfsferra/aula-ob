package aula09;

import java.io.Console;

public class Conta{
    private int numero;
    private double saldo;
    private static int totalContas = 0;

    public Conta(int numero, double saldo){
        setNumero(numero);
        setSaldo(saldo);
        totalContas++;
    }

    public Conta(){
        System.out.println("Sua conta");
        totalContas++;
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

    public int getNumero(){
        return numero;
    }

    public double getSaldo() {
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
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }


    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(123, 1000.00);
        Conta conta3 = new Conta(456, 2000.00);
        Conta conta4 = new Conta(789, 3000.00);
        conta1.setNumero(1);
        conta1.setSaldo(20000);
        conta1.status();
        conta1.debito(10000);
        conta1.debito();
        conta1.status();
        conta1.credito(777);
        conta1.credito();
        conta1.status();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        conta2.status();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        conta3.status();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        conta4.status();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Total de contas criadas: " + Conta.totalContas);
        }

}
