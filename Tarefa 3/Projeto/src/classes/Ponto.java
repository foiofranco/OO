package classes;

import java.util.Scanner;

public class Ponto {
    private double x;
    private double y;
    
    // Construtor:
    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }
    
    // Set - X:
    public void setX(double x){
        this.x = x;
    }
    
    // Get - X:
    public double getX(){
        return this.x;
    }
    
    // Set - Y:
    public void setY(double y){
        this.y = y;
    }
    
    // Get - Y:
    public double getY(){
        return this.y;
    }
    
    // Preencher:
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        // Leitura do ponto X:
        System.out.println("- Ponto X: ");
        System.out.print("> ");
        this.setX(ler.nextDouble());
        //Leitura do ponto Y:
        System.out.println("- Ponto Y: ");
        System.out.print("> ");
        this.setY(ler.nextDouble());
    }
    
    // Distância entre dois pontos:
    public double distancia(Ponto outro){
        double deltaX = outro.getX() - this.x;
        double deltaY = outro.getY() - this.y;
        // Elevar ao quadrado:
        deltaX = Math.pow(deltaX, 2);
        deltaY = Math.pow(deltaY, 2);
        // Raiz quadrada:
        double dist = Math.sqrt(deltaX + deltaY);
        return dist;
    }
    
}
