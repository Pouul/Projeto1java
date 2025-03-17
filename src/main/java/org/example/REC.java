class REC{
    private String[] REC = new String[10];

    public REC(String entrada) {
        int posição = 0;
        try{
            REC[posição] = entrada;
        }
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("(" + posição + "/" + "10)");
    }
}