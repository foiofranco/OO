package classes;

import java.util.Scanner;

public class Aluno {
    
    // Atributos:
    private String nome;
    private String sexo;
    private int idade;
    private String matricula;
    private int ingresso;
    
    // Construtor:
    public Aluno(){
        this.nome = " ";
        this.sexo = " ";
        this.idade = 0;
        this.matricula = " ";
        this.ingresso = 0;
    }
    
    // Set - Aluno:
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // Get - Nome:
    public String getNome(){
        return this.nome;
    }
    
     // Set - Sexo:
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    // Get - Sexo:
    public String getSexo(){
        return this.sexo;
    }
    
    // Set - Idade:
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    // Get - Idade:
    public int getIdade(){
        return this.idade;
    }
    
    // Set - Matricula:
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    // Get - Matricula:
    public String getMatricula(){
        return this.matricula;
    }
    
    // Set - Ingresso:
    public void setIngresso(int ingresso){
        this.ingresso = ingresso;
    }
    
    // Get - Ingresso:
    public int getIngresso(){
        return ingresso;
    }
    
    // Preencher:
    public void preencher(){
        Scanner read = new Scanner(System.in);
        System.out.println("[PREENCHENDO - ALUNO]:");
        System.out.print("- Digite o nome: ");
        this.nome = read.next();
        System.out.print("- Digite o sexo: ");
        this.sexo = read.next();
        System.out.print("- Digite a idade: ");
        this.idade = read.nextInt();
        System.out.print("- Digite a matrícula: ");
        this.matricula = read.next();
        System.out.print("- Digite o ano de ingresso: ");
        this.ingresso = read.nextInt();
        System.out.println();
    }
    
    // Imprimir:
    public void imprimir(){
        System.out.println("[DADOS - ALUNO]: ");
        System.out.println("- Nome: " + this.nome);
        System.out.println("- Sexo: " + this.sexo);
        System.out.println("- Idade: " + this.idade);
        System.out.println("- Matrícula: " + this.matricula);
        System.out.println("- Ano de Ingresso: " + this.ingresso);
        System.out.println();
    }
    
    // Copiar:
    public void copiar(Aluno outro){
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.matricula = outro.getMatricula();
        this.ingresso = outro.getIngresso();
    }
    
}
