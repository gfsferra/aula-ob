package exercicio08;

public class Locadora {
    public static void main(String[] args) {
        CD cd1 = new CD();
        cd1.inserirDados();
        cd1.getTipo();
        cd1.printDados();
        System.out.println("");
        DVD dvd1 = new DVD();
        dvd1.inserirDados();
        dvd1.getTipo();
        dvd1.printDados();
    }
    
}
