package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            while(entrada != "exit"){
                String entrada = scanner.nextLine();
                entrada = entrada.replaceAll(" ", "");
        
                for(int i = 0 ; i < entrada.length() ; i++){
                char[] C_entrada = entrada.toCharArray();

                if(entrada = "REC"){

                }
                else if(entrada = "STOP"){

                }
                else if(entrada = "PLAY"){

                }
                else if(entrada = "Erase"){

                }
                else{
                    throw new Exception("comando inexistente");
                }


        }
    }
}

        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}