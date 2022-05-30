package classes;

import java.util.Scanner;

public class Professor {
    
    // Atributos:
    private String nome;
    private String sexo;
    private int idade;
    private String cpf;
    
    // Construtor:
    public Professor(){
        this.nome = "";
        this.sexo = "";
        this.idade = 0;
        this.cpf = " ";
    }
    
    // Set - Nome:
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
    
    // Set - CPF:
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    // Get - CPF:
    public String getCPF(){
        return this.cpf;
    }
    
    // Preencher:
    public void preencher(){
        Scanner read = new Scanner(System.in);
        System.out.println("[PREENCHENDO - PROFESSOR]:");
        System.out.print("- Digite o nome: ");
        this.nome = read.next();
        System.out.print("- Digte o sexo: ");
        this.sexo = read.next();
        System.out.print("- Digite a idade: ");
        this.idade = read.nextInt();
        System.out.print("- Digite o CPF: ");
        this.cpf = read.next();
        System.out.println();
    }
    
    // Imprimir:
    public void imprimir(){
        System.out.println("[DADOS - PROFESSOR]: ");
        System.out.println("- Nome: " + this.nome);
        System.out.println("- Sexo: " + this.sexo);
        System.out.println("- Idade: " + this.idade);
        System.out.println("- CPF: " + this.cpf);
        System.out.println();
    }
    
    // Copiar:
    public void copiar(Professor outro){
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.cpf = outro.getCPF();
    }
    
}
