package controle;

import java.util.Scanner;

public class DesafioDiaSemana { 
    public static void main(String[] args) {
        //domingo -> 1
        //seg -> 2
        //terça -> 3
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String diaDaSemana = entrada.next();

        if (diaDaSemana.equalsIgnoreCase("domingo")) {
            System.out.println("1");
        } else if (diaDaSemana.equalsIgnoreCase("segunda")) { // ou else if ("terca".equalsIgnoreCase(diaDaSemana) || ("terça".equals...))
            System.out.println("2");
        } else if (diaDaSemana.equalsIgnoreCase("terça")) {
            System.out.println("3"); 
        } else if (diaDaSemana.equalsIgnoreCase("Quarta")) {
            System.out.println("4");
        } else if (diaDaSemana.equalsIgnoreCase("quinta")){
            System.out.println("5");
        } else if (diaDaSemana.equalsIgnoreCase("sexta")) {
            System.out.println("6");
        } else if (diaDaSemana.equalsIgnoreCase("sábado")) {
            System.out.println("7");
        } else {
            System.out.println("Dia inválido!");
        }
        entrada.close();
        
    }
    
}
