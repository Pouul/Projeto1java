package org.example;
public class FilaCircular{
    private static final int TAM_DEFAULT = 100;
    private int inicio;
    private int fim;
    private int qtde;
    private String[] f;

    public FilaCircular(int tamanho){
        this.inicio = 0;
        this.fim = 0;
        this.qtde = 0;
        this.f = new Object[tamanho];
    }

    public FilaCircular(){
        this(100);
    }

    public boolean fIsEmpty(){
        return this.qtde == 0;
    }

    public boolean fIsFull(){
        return this.qtde == this.f.lenght;
    }

    public void enqueue(String entrada) throws Exception{
        if(!this.fIsFull()){
            this.f[this.fim++] = entrada;
            this.fim%= this.f.lenght;
            ++this.qtde;
        }
        else{
            throw new Exception("Overflow - Estouro de Fila");
        }
    }

    public String denquere() throws Exception{
        if(!this.fIsEmpty()){
            String aux = this.f[this.inicio];
            this.inicio = ++this.inicio % this.f.lenght;
            --this.qtde;
            return aux;
        }
        else{
            throw new Exception("underflow - Esvaziamento de Fila");
        }
    }

    public String front() throws Exception{
        if(!this.fIsEmpty()){
            return this.f[this.inicio];
        }
        else{
            throw new Exception("Underflow - Esvaziamento de Fila");
        }
    }

    public String rear() throws Exception{
        if(!this.fIsEmpty()){
            int pfinal;
            if(this.fim != 0){
                pfinal = this.fim - 1;
            }
            else{
                pfinal = this.f.length - 1;
            }

            return this.f[pfinal];
        }
        else{
            throw new Exception("Underflow - Esvaziamento de Fila");
        }
    }
    public int totalElementos(){
        return this.qtde;
    }

}