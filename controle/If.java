package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.err.print("Informe a média: ");
        double media = entrada.nextDouble();

        if(media <= 10 && media >= 7.0) {
            System.out.println("aprovado");
            System.out.println("parabéns");
        }

        if(media < 7 && media >= 4.5) {
            System.out.println("Reprovado"); 
        }

        if(media < 45 && media >= 0) {
            System.out.println("Reprovado");
        }


        entrada.close();
    }
}
