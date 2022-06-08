package aula10;

public class avaliacao03 {
    public static void main(String[] args) {
        
        Agenda a = new Agenda();

        a.armazenaPessoa("Gabriel Sferra", 19, 1.90);
        a.armazenaPessoa("Pedro Escobar", 19, 1.87);
        a.armazenaPessoa("Paulo Renato Paschoal", 19, 1.70);
        a.armazenaPessoa("Rodrigo Ide", 19, 1.70);
        a.armazenaPessoa("Luiza", 18, 1.68);
        a.armazenaPessoa("Gabriela Mangili", 19, 1.55);
        a.armazenaPessoa("Luis Hilario", 22, 1.84);
        a.armazenaPessoa("Mauricio Duarte", 43, 7.00);
        a.armazenaPessoa("Adriana Faria", 39, 1.64);
        a.armazenaPessoa("Guilherme Silva", 38, 1.83);
        a.imprimeAgenda();
        a.removePessoa("Rodrigo Ide");
        a.armazenaPessoa("Maria Eduarda", 11, 1.63);
        a.buscaPessoa("Gabriel Sferra");
        a.imprimeAgenda();
        a.armazenaPessoa("Maria Regina", 67, 1.70);
        a.imprimePessoa(9);
        a.imprimeAgenda();

        System.out.println("==============================================");
        
        Agenda b = new Agenda();

        b.imprimeAgenda();
        b.armazenaPessoa("Gabriel Sferra", 19, 1.90);
        b.armazenaPessoa("Pedro Escobar", 19, 1.87);
        b.imprimeAgenda();
        b.imprimePessoa(2);
        b.removePessoa("Gabriel Sferra");
        b.imprimeAgenda();
        b.removePessoa("Pedro Escobar");
        b.imprimeAgenda();
    }

}

