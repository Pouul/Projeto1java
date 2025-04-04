package org.example;

class Gravador{
    
    private String[] comandos = {"RESET","PLAY","EXIT","ERASE","REC"};
    public gravador(int capacidade){
        FilaCircular g = new FilaCircular(capacidade);
        int tamanho = 0;
    }
    public gravador(){
        FilaCircular g = new FilaCircular(10);
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
        if(f.totalElementos == tamanho){
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
    
    public void gravar(String entrada, int tamanho) throws Exception {
        String[] verifica = verificador(junto);
        if (!isFull() && !isInvalalible(entrada) && Boolean.valueOf(verifica[1])) { 
            f.enquere(entrada);
            System.out.println("(REC: " + posição + "/10)" + entrada);
        }
        else{
            System.out.println("O vetor está cheio ou entrada é inválida");
        }
    }

    public void apagar(int tamanho) {
        if(isEmpty()){
            throw new Exception("Underflow - Esvaziamento de Gravador");
        }
        while(!isEmpty()){
            f.denquere();
        }
    }


}