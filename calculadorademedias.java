import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
        public static void main(String[] args) {
                // 1) Faça um algoritmo que receba quatro números inteiros, calc>
                Scanner scan = new Scanner(System.in);

                System.out.println("CALCULADORA DA MÉDIA DE 4 NOTAS");
                System.out.println("-------------------------------");

                System.out.print("Digite a nota 01: ");
                int nota1 = scan.nextInt();
                System.out.print("Digite a nota 02: ");
System.out.print("Digite a nota 02: ");
                int nota2 = scan.nextInt();
                System.out.print("Digite a nota 03: ");
                int nota3 = scan.nextInt();
                System.out.print("Digite a nota 04: ");
                int nota4 = scan.nextInt();

                float media = (nota1 + nota2 + nota3 + nota4)/4f;

                System.out.println("A média é: " + media);
        }
}
