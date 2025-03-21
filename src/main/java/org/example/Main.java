package org.example;

import java.util.Scanner;

// função para ler entrada , pode ser depois
class ler{
    ler(String entrada){

    }
}

public class Main {
    public static void gravar(String gravados , int posição , String arr[] , int posiçãoR) {
        
        try{
            arr[posição] = gravados;
        }
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        
        System.out.println("(" + posiçãoR + "/" + "10) " + arr[posição]);
    }
    

    public static void main(String[] args) {
        try{
            
            Scanner scanner = new Scanner(System.in);
            String entrada = "INICIAÇÃO";
            int posição = 0;
            int posiçãoR = 0;

            while(!entrada.equals("EXIT")){
              entrada = scanner.nextLine().replaceAll(" ", "");
              
              String M_entrada = entrada.toUpperCase();
              
              String[] RECOR = new String[10];
              int i ;

              //para ler o entrada variavel e equação
              for(i = 0 ; i < entrada.length() ; i++){
                
              }
                
              if(M_entrada.equals("REC")){
                System.out.println("entrou REC");
                
                outerLoop:
                for(i = 0 ; i < 10 ; i++){
                  String gravados = scanner.nextLine();
                  switch(gravados) {
                    case "STOP":
                      posição = i;
                      System.out.println("encerrando gravação..." + "(" + posição + "/" + "10)");
                      break outerLoop;
                    // mudança para simplificar
                    case "PLAY":
                      i--;
                      throw new Exception("Comando inválido para gravação");
                    case "ERASE":
                      i--;
                      throw new Exception("Comando inválido para gravação");
                      
                    case "EXIT":
                      i--;
                      throw new Exception("Comando inválido para gravação");
                      
                    case "RESET":
                      i--;
                      throw new Exception("Comando inválido para gravação");
                      
                    case "REC":
                      i--;
                      throw new Exception("Comando inválido para gravação");
                      
                    default:
                      gravar(gravados , i , RECOR , ++i);
                  }   
                }
              }
              
              //ganbiarra
              else if(M_entrada.equals("REC")){
                  
              }

              else if(M_entrada.equals("ERASE")){
                RECOR = new String[0];
                System.out.println("Gravação apagada");
              }

              else if(M_entrada.equals("PLAY")){
                if(posição == 0){
                  throw new Exception("não há comandos gravados");
                }
                else{
                  for(i = 0 ; i < posição ; i++){
                  //ler(RECOR[i]);
                  }
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