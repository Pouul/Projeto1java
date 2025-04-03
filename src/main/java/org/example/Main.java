package org.example;

import java.util.Scanner;

// Classe para leitura (ainda não implementada)
class Ler {
    Ler(String entrada) {
        
    }
}

public class Main {
    public static void gravar(String gravados, int posicao, String arr[], int posicaoR) {
        try {
            arr[posicao] = gravados;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("(" + posicaoR + "/10) " + arr[posicao]);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String entrada = "INICIAÇÃO";
            int posicao = 0;
            int posicaoR = 0;
            String[] RECOR = new String[10];
            
            while (!entrada.equals("EXIT")) {
                entrada = scanner.nextLine().replaceAll(" ", "");
                String M_entrada = entrada.toUpperCase();
                int i;
                
                if (M_entrada.equals("REC")) {
                    System.out.println("Entrou REC");
                    Gravador g = new gravdor(10);
                    outerLoop:
                    for (i = 0; i < 10; i++) {
                        String gravado = scanner.nextLine();
                        if(gravado == "STOP"){
                            posicao = i;
                            System.out.println("Encerrando gravação... (" + posicao + "/10)");
                            break outerLoop;
                        }
                        else{

                            gravar(gravado);
                        }
                        
                    }
                }
                
                else if (M_entrada.equals("ERASE")) {
                    g.apagar();
                    System.out.println("Gravação apagada");
                } 
                else if (M_entrada.equals("PLAY")) {
                    if (posicao == 0) {
                        throw new Exception("Não há comandos gravados");
                    } else {
                        for (i = 0; i < posicao; i++) {
                            // Ler(RECOR[i]); // Ainda não implementado
                        }
                    }
                } else if (M_entrada.equals("RESET")) {
                    // Implementação futura
                } else if (M_entrada.equals("VARS")) {
                    // Implementação futura
                } else {
                    throw new Exception("Comando inválido");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
