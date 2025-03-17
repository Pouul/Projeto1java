package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> letrasList = new ArrayList<>();
        ArrayList<Integer> numerosList = new ArrayList<>();

        System.out.println("Digite seu prompt: ");

        while (true) {
            try {
                // Ele vai digitar o pronpt ex: y = 3
                String entrada = scanner.nextLine().replaceAll(" ", ""); 
                // aqui ele armazena na entrada a string digitada e remove as partes em branco agr esta assim y=3


                if (Character.isLetter(entrada.charAt(0))) { 
                    char primeiroChar = entrada.charAt(0);
                // analisa se o primeiro elemento da string e se for uma letra entao addiciona ao array de letras

                
                    if (entrada.indexOf('=')) { 
                    

                        if (igualIndex != -1 && igualIndex < entrada.length() - 1) {
                            String numeroStr = entrada.substring(igualIndex + 1);

                            try {
                                int numero = Integer.parseInt(numeroStr);
                                letrasList.add(primeiroChar);
                                numerosList.add(numero);
                                System.out.println("Letra e número adicionados: " + primeiroChar + " = " + numero);
                            } catch (NumberFormatException e) {
                                System.out.println("Valor após '=' não é um número válido.");
                            }
                        } 
                    } 
                } 

            } 
            }
        }

        System.out.println("Letras adicionadas: " + letrasList);
        System.out.println("Números adicionados: " + numerosList);

        scanner.close();
    }
}