package org.example;

import java.util.Scanner;

// função para ler entrada , pode ser depois
class ler{
    ler(String entrada){

    }
}

public class Main {
    public static void main(String[] args) {
        try{
            gravador aux = new gravador();
            Scanner scanner = new Scanner(System.in);
            String entrada = scanner.nextLine();
             int posição = 0;

            while(entrada != "exit"){
              entrada = scanner.nextLine();
              entrada = entrada.replaceAll(" ", "");
              String M_entrada = entrada.toUpperCase();
              char[] C_entrada = M_entrada.toCharArray();
              int i ;

              //para ler o entrada variavel e equação
              for(i = 0 ; i < entrada.length() ; i++){
                
              }
                
              if(entrada == "REC"){
                
                String[] RECOR = new String[10];
                for(i = 0 ; i < 10 ; i++){
                  entrada = scanner.nextLine();
                  switch(entrada) {
                    case "STOP":
                      posição = i;
                      System.out.println("encerrando gravação..." + "(" + posição + "/" + "10)");
                      break;
                    case "PLAY":
                      throw new Exception("Comando inválido para gravação");
                      i--;
                      break;
                    case "ERASE":
                      entrada = null;
                      System.out.println("Gravação apagada");
                      break;
                    default:
                      aux.gravar(entrada , i , RECOR);
                  }   
                }
              }

              if(entrada == "ERASE"){
                
                System.out.println("Gravação apagada");
              }

              else if(entrada == "PLAY"){
                for(i = 0 ; i < posição ; i++){
                  //ler(RECOR[i]);
                }
              }
                
              else if(entrada == "RESET"){

              }

              else if(entrada == "VARS"){

              }

              //se nao for nenhum das opções, a entrada é invalido
              else{

              } 
            }
        }     

        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}