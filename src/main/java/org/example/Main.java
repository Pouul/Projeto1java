package org.example;

import java.util.Scanner;

public class Main {
    
    public static void Ler(char[] junto, int tracker, Pilha pilha,PilhaNum pilhanum,char[] vari,int[] valor,char[] posfixa,int reach,int aux,int posicao,String entrada,Gravador g)  {
        
            int convertido;
            boolean teste ; // trocar
            boolean teste2; //trocar
            boolean teste3;
            
            
            Scanner scanner = new Scanner(System.in);

            if(junto.length >= 3 && junto[1] == '=')
            {
                vari[tracker] = junto[0];
                convertido = Integer.parseInt(String.valueOf(junto[2]));
                valor[tracker] = convertido;

                System.out.println(vari[tracker]+" = "+valor[tracker]);
                tracker++;
            }

            else if (junto.length == 1) {
                boolean encontrado = false;
                for (int j = 0; j < tracker; j++) {
                    if (junto[0] == vari[j]) {
                        System.out.println(valor[j]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Variável" +junto[0]+ " não inciada.");
                }
            }
            else if (entrada.equals("REC")) {
                
                String gravado;
                outerLoop:
                for (int i = 0; i < 10; i++) {
                    gravado = scanner.nextLine();
                    if(gravado.equals("STOP")){
                        posicao = i;
                        System.out.println("Encerrando gravação... (" + posicao + "/10)");
                        break outerLoop;
                    }
                    else{
                        try {
                        g.gravar(gravado,junto,i);
                        } 
                        catch (Exception e) {
                        System.out.println("Erro ao gravar: " + e.getMessage());
                    }
                        
                    } 
                }
            }

            else if(entrada.equals("REC")){}

            else if (entrada.equals("ERASE")){
                try {
                    g.apagar();
                } 
                catch (Exception e) {
                    System.out.println("Erro ao gravar: " + e.getMessage());
                }
                System.out.println("Gravação apagada");
            } 

            else if (entrada.equals("RESET")) {
                vari = new char[10];
                valor = new int[10];
                tracker = 0;
                System.out.println("Variaveis reiniciadas");
            } 

            else if (entrada.equals("VARS")) {
                if(tracker == 0)
                {
                    System.out.println("Nenhuma variavel iniciada");
                }
                else
                {
                    for(int j = 0;j<tracker;j++)
                    {
                        System.out.println(vari[j]+" = "+valor[j]);
                    }
                }
            } 

            else
            {
                String[] verifica = verificador(junto);
                teste = Boolean.valueOf(verifica[1]);
                teste2 = vazio(vari);
                teste3 = diferente(vari,junto);
                if(teste == false){
                    System.out.println(verifica[0]);
                    junto = new char[20];
                }
                if(teste2 == false || teste3 == false)
                {
                    for(int d = 0;d< junto.length;d++){
                        if(junto[d] >= 'A' && junto[d] <= 'Z'){
                            System.out.println("Variavel "+junto[d]+" nao inciada");
                        }
                    }
                    junto = new char[20];
                }
                
                else if(teste == true && teste2 == true && teste3 == true)
                {
                    while(reach < junto.length)
                    {
                        char val = junto[reach];
                        if(val == '+' || val == '-' || val == '(')
                        {
                            pilha.push(val);
                        }
                        else if(val == '*' || val == '/' || val == '^')
                        {
                            while(!pilha.isEmpty() && (pilha.peek() == '*' || pilha.peek() == '/' || pilha.peek() == '^'))
                            {
                                posfixa[aux++] = pilha.pop();
                            }
                            pilha.push(val);
                        }
                        else if(val == ')')
                        {
                            while (!pilha.isEmpty() && pilha.peek() != '(')
                            {
                                posfixa[aux++] = pilha.pop();
                            }
                            pilha.pop();
                        }
                        else
                        {
                            posfixa[aux++] = val;
                        }
                        reach++;
                    }
                    while(!pilha.isEmpty())
                    {
                        posfixa[aux++] = pilha.pop();
                    }
                    System.out.println("Expressao pos-fixa:");//Imprimi a expressao na forma pos-fixa
                    for (int l = 0; l < aux; l++)
                    {
                        System.out.print(posfixa[l] + " ");
                    }
                    System.out.println("");
                    //posfixa = new char[20];
                    reach = 0;
                    //aux = 0;

                    
                    int res = 0;
                    int num1 = 0;
                    int num2 = 0;

                    for(int u = 0; u < aux;u++){
                        if(posfixa[u] == '+')
                        {
                            num2 = pilhanum.pop();
                            num1 = pilhanum.pop();
                            res = num1 + num2;
                            pilhanum.push(res);
                        }
                        else if(posfixa[u] == '-')
                        {
                            num2 = pilhanum.pop();
                            num1 = pilhanum.pop();
                            res = num1 - num2;
                            pilhanum.push(res);
                        }
                        else if(posfixa[u] == '*')
                        {
                            num2 = pilhanum.pop();
                            num1 = pilhanum.pop();
                            res = num1 * num2;
                            pilhanum.push(res);
                        }
                        else if(posfixa[u] == '/')
                        {
                            num2 = pilhanum.pop();
                            num1 = pilhanum.pop();
                            res = num1 / num2;
                            pilhanum.push(res);
                        }
                        else if(posfixa[u] == '^')
                        {
                            num2 = pilhanum.pop();
                            num1 = pilhanum.pop();
                            for (int p = 0; p < num2; p++) {
                                res *= num1;
                            }
                            pilhanum.push(res);
                        }
                        else
                        {
                            for (int o = 0; o < vari.length; o++)
                            {
                                if (vari[o] == posfixa[u])
                                {
                                    pilhanum.push(valor[o]);
                                }
                            }
                        }
                    }
                    System.out.println(res);
                    posfixa = new char[20];
                    junto = new char[20];
                    aux = 0;
            }
        }
        
    }
    public static String[] verificador(char[] junto){
        char[] veri = junto;
        int operadores = 0;
        int parenteses = 0;
        int seguido = 0;
        for(int i = 0;i<veri.length;i++)
        {
            if(veri[i] == '+' || veri[i] == '-' || veri[i] == '*' || veri[i] == '/' || veri[i] == '^')
            {
                operadores++;
            }
            else if(veri[i] == '(' || veri[i] == ')')
            {
                parenteses++;
            }
            else if(i < veri.length - 1 && veri[i] >= 'A' && veri[i] <= 'Z' && veri[i + 1] >= 'A' && veri[i + 1] <= 'Z')
            {
                seguido++;
            }
        }
        if(operadores == 0){
            return new String[]{"Erro: Comando invalido", "false"};
        }
        else if(parenteses%2 != 0){
            return new String[]{"Erro: Expressao invalida","false"};
        }
        else if(seguido > 0){
            return new String[]{"Erro: Expressao invalida","false"};
        }
        return new String[]{"","true"};
    }

    public static boolean vazio(char[] vari){
        for(int i = 0;i<vari.length;i++){
            if(vari[i] != '\0')
            {
                return true;
            }
        }
        return false;
    }

    public static boolean diferente(char[] vari, char[] junto){
        for(int i = 0;i<junto.length;i++)
        {
            boolean encontrado = false;
            for(int j = 0;j <vari.length;j++)
            {
                if(junto[i] == vari[j])
                {
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado && junto[i] >= 'A' && junto[i] <= 'Z')
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            Pilha pilha = new Pilha();
            String entrada = "Iniciação";
            PilhaNum pilhanum = new PilhaNum();
            char[] vari = new char[10];
            int[] valor = new int[10];
            char[] posfixa = new char[20];
            char[] junto = new char[20];
            int reach = 0, aux = 0;
            junto[0] = 'I';
            int convertido;
            int tracker = 0;
            int posicao = 0;
            int i;
            Gravador g = new Gravador(10);

            while (!entrada.equals("EXIT")) {
                entrada = scanner.nextLine().replaceAll(" ", "").toUpperCase();
        

                if (entrada.equals("PLAY")){
                    if (posicao == 0) {
                        throw new Exception("Não há comandos gravados");
                    } else {
                        for (i = 0; i < posicao; i++) {
                            Ler(g.dequeue().toCharArray(),tracker,pilha,pilhanum,vari,valor,posfixa,reach,aux,posicao,entrada,g);
                        }
                    }
                } 
                //char[] junto, int tracker, Pilha pilha,PilhaNum pilhanum,char[] vari,int[] valor,char[] posfixa,int reach,int aux,int posicao,String entrada,Gravador g
                else {
                    junto = entrada.toCharArray();
                    Ler(junto,tracker,pilha,pilhanum,vari,valor,posfixa,reach,aux,posicao,entrada,g);
                    
                }

            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

