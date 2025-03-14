class Vars{
    private char variavel;
    private int valor;
    private static final char VARS_DEFAULT = 'X';
    private static final int VAL_DEFAULT = 0; 
    

    public Vars(char variavel, int valor){
        this.variavel = variavel;
        this.valor = valor;
    }

    public Vars(){
        this(VARS_DEFAULT, VAL_DEFAULT);
    }

    public exibirvalores(){
        
    }
    
}