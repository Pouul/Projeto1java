package org.example;

import java.util.Scanner;

// função para ler entrada , pode ser depois
class ler{
    ler(String entrada){

    }
}

public class Main {
    public static void gravar(String entrada , int posição , String arr[]) {
        
        try{
            arr[posição] = entrada;
        }
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("(" + posição + "/" + "10)" + arr[posição]);
    }
    public static void main(String[] args) {
        try{
            
            Scanner scanner = new Scanner(System.in);
            String entrada = "INICIAÇÃO";
            int posição = 0;

            while(!entrada.equals("EXIT")){
              entrada = scanner.nextLine();
              entrada = entrada.replaceAll(" ", "");
              String M_entrada = entrada.toUpperCase();
              char[] C_entrada = M_entrada.toCharArray();
              int i ;

              //para ler o entrada variavel e equação
              for(i = 0 ; i < entrada.length() ; i++){
                
              }
                
              if(M_entrada.equals("REC")){
                System.out.println("entrou REC");
                String[] RECOR = new String[10];
                outerLoop:
                for(i = 0 ; i < 10 ; i++){
                  String gravados = scanner.nextLine();
                  switch(gravados) {
                    case "STOP":
                      posição = i;
                      System.out.println("encerrando gravação..." + "(" + posição + "/" + "10)");
                      break outerLoop;
                    case "PLAY":
                      i--;
                      throw new Exception("Comando inválido para gravação");
                    case "ERASE":
                      entrada = null;
                      System.out.println("Gravação apagada");
                      break;
                    default:
                      gravar(entrada , i , RECOR);
                  }   
                }
                System.out.println(RECOR[0]);
              }

              if(M_entrada.equals("ERASE")){
                
                System.out.println("Gravação apagada");
              }

              else if(M_entrada.equals("PLAY")){
                for(i = 0 ; i < posição ; i++){
                  //ler(RECOR[i]);
                }
              }
                
              else if(M_entrada.equals("RESET")){

              }

              else if(M_entrada.equals("VARS")){

              }
              //se nao for nenhum das opções, a entrada é invalido
              else{
                  throw new Exception("comando invalido");
                
              } 
            }
        }     

        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}