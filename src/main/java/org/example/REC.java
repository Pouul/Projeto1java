package org.example;

class gravador{
    
    public gravador(){

    }
    
    public static void gravar(String entrada , int posição , String arr[]) {
        
        try{
            arr[posição] = entrada;
        }
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("(" + posição + "/" + "10)" + arr[posição]);
    }

    
}