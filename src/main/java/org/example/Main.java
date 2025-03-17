package org.example;

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
                char[] C_entrada = entrada.toCharArray();

                //para ler o entrada por elementos
                for(int i = 0 ; i < entrada.length() ; i++){
                
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

                if(entrada == "PLAY"){
                  for(i = 0 ; i < posição ; i++){
                    ler(REC[i]);
                  }
                }
                            
        
    }
}

        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}