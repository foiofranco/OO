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
    
    // Auxílio de Impressão:
    public String toString(){
        return "(" + (int) this.x + "," + (int) this.y + ")";
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
    
    // Determinante:
    public double determinante(Ponto p2, Ponto p3){
        double esquerda = (this.x * p2.getY() * 1) + (p2.getX() * p3.getY() * 1) + (this.y * 1 * p3.getX());
        double direita = (p3.getX() * p2.getY() * 1) + (p2.getX() * this.y * 1) + (p3.getY() * 1 * this.x);
        double det = esquerda - direita;
        return det;
    }
    
    // Verificação Colinear + Área do Triângulo:
    public String areaDoTriangulo(Ponto p2, Ponto p3){
        double det = this.determinante(p2, p3);
        double area = det/2;
        double positivo = area*(-1);
        if(det == 0){
            return ("> São colineares, com a área do triângulo 0.");
        }else{
            if(det < 0){
                return ("> Não colineares, com a área do triângulo " + positivo + ".");
            }else{
                return ("> Não colineares, com a área do triângulo " + area + ".");
            }
        }
    }
    
}
