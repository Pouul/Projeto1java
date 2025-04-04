package org.example;

class Gravador{
    
    private String[] comandos = {"RESET","PLAY","EXIT","ERASE","REC"};
    private int tamanho;
    private FilaCircular f;

    public Gravador(int capacidade){
        this.f = new FilaCircular(capacidade);
        this.tamanho = 0;
    }
    public Gravador(){
        this(10);
    }

    public boolean isEmpty(){
        if(this.tamanho == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(this.f.totalElementos() == this.tamanho){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isInvalid(String entrada){
        for(int i = 0; i < tamanho; i++ ){
            if(entrada.equals(comandos[i])){
                return true;
            }
        }
        return false;
    }
    
    public void gravar(String entrada,char[] junto, int tamanho) throws Exception {
        String[] verifica = Main.verificador(junto);
        if (!isFull() && !isInvalid(entrada) && Boolean.valueOf(verifica[1])) { 
            f.enqueue(entrada);
            System.out.println("(REC: " + tamanho + "/10)" + entrada);
        }
        else{
            System.out.println("O vetor está cheio ou entrada é inválida");
        }
    }

    public void apagar()throws Exception {
        if(isEmpty()){
            throw new Exception("Underflow - Esvaziamento de Gravador");
        }
        while(!isEmpty()){
            f.denqueue();
        }
    }
    public String dequeue()throws Exception{
        return f.denqueue();
    }
}