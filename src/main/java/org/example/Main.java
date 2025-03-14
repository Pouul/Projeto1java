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

                if(C_entrada[1] == "="){
                    
            }
        }
    }
}

        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}