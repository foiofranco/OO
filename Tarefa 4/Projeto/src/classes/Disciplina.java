package classes;

import classes.Professor;
import classes.Aluno;
import java.util.Scanner;

public class Disciplina {
    
    // Atributos:
    private String nome;
    private int semestre;
    private String horario;
    private Professor professor;
    private Aluno alunos[];
    
    // Construtor:
    public Disciplina(){
        this.nome = " ";
        this.semestre = 0;
        this.horario = " ";
        this.professor = new Professor();
        this.alunos = new Aluno[2];
        for(int i = 0; i < 2; i++){
            alunos[i] = new Aluno();
        }
    }
    
    // Set - Nome:
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // Get - Nome:
    public String getNome(){
        return this.nome;
    }
    
    // Set - Semestre:
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
    
    // Get - Semestre:
    public int getSemestre(){
        return this.semestre;
    }
    
    // Set - Horário:
    public void setHorario(String horario){
        this.horario = horario;
    }
    
    // Get - Horário:
    public String getHorario(){
        return horario;
    }
    
    // Set - Professor:
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    // Get - Professor:
    public Professor getProfessor(){
        return this.professor;
    }
    
    // Set - Alunos:
    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }
    
    // Get - Alunos:
    public Aluno[] getAlunos(){
        return this.alunos;
    }
    
    // Preencher:
    public void preencher(){
        Scanner read = new Scanner(System.in);
        System.out.println("[PREENCHER - DISCIPLINA]:");
        System.out.print("- Digite o nome: ");
        this.nome = read.next();
        System.out.print("- Digite o semestre: ");
        this.semestre = read.nextInt();
        System.out.print("- Digite o horário: ");
        this.horario = read.next();
        System.out.println();
        professor.preencher();
        for(int i = 0; i < 2; i++){
            alunos[i].preencher();
        }
    }
    
    // Imprimir:
    public void imprimir(){
        System.out.println("[DADOS - DISCIPLINA]:");
        System.out.println("- Nome: " + this.nome);
        System.out.println("- Semestre: " + this.semestre);
        System.out.println("- Horário: " + this.horario);
        System.out.println("");
        professor.imprimir();
        for(int i = 0; i < 2; i++){
            alunos[i].imprimir();
        }
    }
    
    // Copiar:
    public void copiar(Disciplina outra){
        this.nome = outra.getNome();
        this.semestre = outra.getSemestre();
        this.horario = outra.getHorario();
        this.professor.copiar(outra.getProfessor());
        for(int i = 0; i < 2; i++){
            this.alunos[i].copiar(outra.getAlunos()[i]);
        }
    }
    
}
