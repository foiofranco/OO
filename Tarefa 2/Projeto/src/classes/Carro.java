package classes;

import classes.Roda;
import java.util.Scanner;

public class Carro {
    private String fabricante;
    private String modelo;
    private double motor;
    private String cor;
    private Roda[] roda;
    
    // Construtor;
    public Carro(){
        this.fabricante = " ";
        this.modelo = " ";
        this.motor = 0.0;
        this.cor = " ";
        this.roda = new Roda[4];
        for (int i = 0; i <=3; i++){
            roda[i] = new Roda();
        }
    }
    
    // Set - Fabricante:
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    
    // Get - Fabricante:
    public String getFabricante(){
        return this.fabricante;
    }
    
    // Set - Modelo:
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    
    // Get - Modelo:
    public String getModelo(){
        return this.modelo;
    }
    
    // Set - Motor:
    public void setMotor(double motor){
        this.motor = motor;
    }
    
    // Get - Motor:
    public double getMotor(){
        return this.motor;
    }
    
    // Set - Cor:
    public void setCor(String cor){
        this.cor = cor;
    }
    
    // Get - Cor:
    public String getCor(){
        return this.cor;
    }
    
    // Set - Roda:
    public void setRoda(Roda[] roda){
        this.roda = roda;
    }
    
    // Get - Roda:
    public Roda[] getRoda(){
        return this.roda;
    }
    
    // Preencher:
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("[DADOS DO CARRO]:");
        System.out.print("- Informe o fabricante: \n > ");
        this.fabricante = ler.next();
        System.out.print("- Informe o modelo: \n > ");
        this.modelo = ler.next();
        System.out.print("- Informe o motor: \n > ");
        this.motor = ler.nextDouble();
        System.out.print("- Informe a cor: \n > ");
        this.cor = ler.next();
        for(int i = 0; i <= 3; i++){
            System.out.println("[DADOS DA RODA " + (i+1) + "]:");
            this.roda[i].preencher();
        }
    }
    
    // Copiar:
    public void copiarCarro (Carro copia){
        this.fabricante = copia.getFabricante();
        this.modelo = copia.getModelo();
        this.motor = copia.getMotor();
        this.cor = copia.getCor();
        for (int i = 0; i <=3; i++){
            this.roda[i].copiarRoda(copia.getRoda()[i]);
        }
    }
    
    // Imprimir:
    public void imprimirCarro(){
        System.out.println("[CARRO]: ");
        System.out.print("- Fabricante: " + (this.fabricante) + "\n");
        System.out.print("- Modelo: " + (this.modelo) + "\n");
        System.out.print("- Motor: " + (this.motor) + "\n");
        System.out.print("- Cor: " + (this.cor) + "\n");
        for (int i = 0; i <= 3; i++){
            System.out.println("[RODA " + (i+1) + "]:");
            this.roda[i].imprimirRoda();
        }
    }
}
