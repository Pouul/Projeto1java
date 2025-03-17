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
            Scanner scanner = new Scanner(System.in);

            while(entrada != "exit"){
              String entrada = scanner.nextLine();
              entrada = entrada.replaceAll(" ", "");
              String M_entrada = entrada.toUpperCase();
              char[] C_entrada = M_entrada.toCharArray();
              int i ;

              //para ler o entrada variavel e equação
              for(i = 0 ; i < entrada.length() ; i++){
                
              }
                
              if(entrada == "REC"){
                String[] REC = new String[10];
                for(i = 0 ; i < 10 ; i++){
                  entrada = scanner.nextLine();
                  switch(entrada) {
                    case STOP:
                      int posição = i;
                      System.out.println("encerrando gravação..." + "(" + posição + "/" + "10)");
                      break;
                    case PLAY:
                      throw new Exception("Comando inválido para gravação");
                      i--;
                      break;
                    case ERASE:
                      entrada = null;
                      System.out.println("Gravação apagada");
                      break;
                    default:
                      REC(entrada , i , REC);
                  }   
                }
              }

              if(entrada == "ERASE"){
                entrada = null;
                System.out.println("Gravação apagada");
              }

              else if(entrada == "PLAY"){
                for(i = 0 ; i < posição ; i++){
                  ler(REC[i]);
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