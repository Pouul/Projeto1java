class REC{
    

    public REC(String entrada , int posição , String REC[]) {
        
        try{
            REC[posição] = entrada;
        }
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("(" + posição + "/" + "10)" + REC[posição]);
    }

    
}