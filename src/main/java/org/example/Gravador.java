package org.example;

class Gravador{
    private String[] vetor;
    private String[] comandos = {"RESET","PLAY","EXIT","ERASE","REC"};
    public gravador(int capacidade){
        this.vetor = new String [capacidade];
        int tamanho = 0;
    }

    public boolean isEmpty(){
        if(tamanho == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(vetor.length == tamanho){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isInvalalible(String entrada){
        for(int i = 0; i < tamanho; i++ ){
            if(entrada == vetor[i]){
                return true;
            }
            else{
                throw new Exception("entrada invalida no Gravador");
            }
        }
    }
    
    public void gravar(String entrada, int tamanho) {
        if (!isFull() && !isInvalalible(entrada)) { 
            vetor[tamanho] = entrada;
            System.out.println("(REC: " + posição + "/10)" + entrada);
        }
        else{
            System.out.println("O vetor está cheio!");
        }
    }

    public void apagar(int tamanho) {
        
        while(!isEmpty()){
            vetor[tamanho] = null;
            tamanho--;
        }
    }


}