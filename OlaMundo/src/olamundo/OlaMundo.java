package olamundo;

import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome");
        nome = tec.nextLine();
        System.out.println("Ola, "+nome);
        
    }
    
}
