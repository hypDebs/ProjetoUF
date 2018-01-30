package Lutadores;
public class Aula07Lutadores {
    public static void main(String[] args) {
        PerfildeLutadores l[] = new PerfildeLutadores[6];
                l[0]= new PerfildeLutadores("Pretty Boy","França",31,1.75f,68.9f,11,2,1);
                l[1] =new PerfildeLutadores("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
                l[2] =new PerfildeLutadores("Snapsshadow","Eua",35,1.65f,80.9f,12,2,1);
                l[3] =new PerfildeLutadores("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
                l[4]= new PerfildeLutadores("UFOCobol","Brasil",37,1.70f,119.3f,5,4,3);
                l[5]= new PerfildeLutadores("Nerdart","EUA",30,1.81f,105.7f,12,2,4);
                
                
       Luta UEC01 = new Luta();
       UEC01.marcarLuta(l[0], l[1]);
       UEC01.Lutar(); 
    }
    
}
