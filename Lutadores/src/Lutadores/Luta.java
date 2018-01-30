package Lutadores;

import java.util.Random;

public class Luta {
    
    private PerfildeLutadores desafiado;
    private PerfildeLutadores desafiante ;
    private int rounds;
    private boolean aprovada;
    //Só pode marcar a luta...
    public void marcarLuta(PerfildeLutadores  l1,PerfildeLutadores l2 ){
        if(l2.getCategoria().equals(l1.getCategoria())
           && l1!=l2){
            //Se a luta for aprovada 
            this.aprovada = true;
            ///Se o Desafiado for l1 
            this.desafiado = l1;
            //Se o Desafiante for l2
            this.desafiante= l2;
        }else{
            //A luta não sera Marcada 
            //Se luta não ser aprovada
            this.aprovada = false;
            //Se Desafiado for Nulo
            this.desafiado = null;
            //Se Desafiante for for Nulo
            this.desafiante = null;
        }
    }
    //Metodo Lutar
    public void Lutar(){
        //Se a luta for aprovada, o l1 e l2 sera apresentado
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            //Vai ser gerado um numero aleatório de 0 a 2 
            Random aleatorio = new Random(); 
            int vencedor = aleatorio.nextInt(3); //0 1 2
            //Cada numero tem um significado (0 empate)(1 Vence)(2 Perde)
            switch(vencedor){
                case 0 : //Empate
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                    break;
                case 1 : //Desafiado vence
                    System.out.println("=====================================");
                    System.out.println("Vitória do "+this.desafiado.getNome());
                    System.out.println("=====================================");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2 : //Desafiante vence
                    System.out.println("=====================================");
                    System.out.println("Vitória do "+this.desafiante.getNome());
                    System.out.println("=====================================");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                break;    
                          
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public PerfildeLutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(PerfildeLutadores desafiado) {
        this.desafiado = desafiado;
    }

    public PerfildeLutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(PerfildeLutadores desafiante) {
        this.desafiante = desafiante;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
