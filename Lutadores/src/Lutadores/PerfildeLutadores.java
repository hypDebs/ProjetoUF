package Lutadores;

public class PerfildeLutadores {
 private String nome;
 private String nacionalidade;
 private int idade;
 private float altura;
 private float peso;
 private String categoria;
 private int vitorias;
 private int derrotas;  
 private int empates;

 //Métodos
 public void apresentar(){
     System.out.println("Lutador: "+this.getNome());
     System.out.println("Origem: "+this.getNacionalidade());
     System.out.println("Idade: "+this.getIdade());
     System.out.println("Peso: "+this.getPeso());
     System.out.println("Altura: "+this.getAltura());
     System.out.println("Vitorias: "+this.getVitorias());
     System.out.println("Derrotas: "+this.getDerrotas());
     System.out.println("Empates: "+this.getEmpates());
 }  
 public void status(){
     System.out.println("Nome: "+this.getNome());
     System.out.println("É um peso : "+this.getCategoria());
     System.out.println("Ganhou "+this.getVitorias()); 
     System.out.println("Perdeu "+this.getDerrotas());
     System.out.println("Empatou "+this.getEmpates());
 }
 public void ganharLuta(){
     setVitorias(getVitorias()+1); 
 }
 public void perderLuta(){
     setDerrotas(getDerrotas()+1);
 }
 public void empatarLuta(){
     setEmpates(getEmpates()+1);
 }
 
 
//Métodos (get)acessores e (set)modificadores
 //Construtor   
     public PerfildeLutadores(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
 
    public void setAltura(float altura) {
        this.altura = altura;
    }
//-------------------------------------
    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        
        if(this.peso<52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <=83.9){
            this.categoria = "Medio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }  
    }
// ------------------------------------
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
    
 
 
}
