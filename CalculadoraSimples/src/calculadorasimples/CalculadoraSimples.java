package calculadorasimples;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
       float a,b,r;
       int opcao =0;
        System.out.println("Informe o 1º valor: ");
        a = tec.nextFloat();
        System.out.println("Informe o 2º valor: ");
        b = tec.nextFloat();
        System.out.println("======================");
        System.out.println("ESCOLHA UMA OPÇÃO");
        System.out.println("[1] Adição");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        opcao = tec.nextInt();
        System.out.println("======================");
        
        if(opcao == 1)
        {
            r = a + b;
            System.out.println("Resultado: "+r);
        }if(opcao == 2)
        {
            r = a - b;
            System.out.println("Resultado: "+r);
        }if(opcao == 3)
        {
            r = a * b;
            System.out.println("Resultado: "+r);
        }if(opcao == 4)
            if(b==0){
                System.out.println("Erro: Divisão por zero");
            }else{
                r = a/b;
                System.out.println("Resultado: "+r);
            }
        {
           
        }
        
    }
    
}

