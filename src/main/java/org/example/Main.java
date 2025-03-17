package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            while(entrada != "exit"){
                String entrada = scanner.nextLine();
                entrada = entrada.replaceAll(" ", "");
                
                //para ler o entrada por elementos
                for(int i = 0 ; i < entrada.length() ; i++){
                char[] C_entrada = entrada.toCharArray();
                }
                
                if(entrada == "REC"){
                    for(i = 0 ; i < 10 ; i++){
                        entrada = scanner.nextLine();
                    switch(entrada) {
                        case STOP:
                          
                          break;
                        case PLAY:
    
                          break;
                        case ERASE:
    
                          break;
                        default:
                          REC(entrada);
                          }
                            
                      }
                }
        
    }
}

        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}