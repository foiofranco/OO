package classes;

import classes.Ponto;

public class Triangulo {
    Ponto p1, p2, p3;
    
    // Construtor;
    public Triangulo(){
        this.p1 = new Ponto();
        this.p2 = new Ponto();
        this.p3 = new Ponto();
    }
    
    // Set - P1:
    public void setP1(Ponto p1){
        this.p1 = p1;
    }
    
    // Get - P1:
    public Ponto getP1(){
        return this.p1;
    }
    
    // Set - P2:
    public void setP2(Ponto p2){
        this.p2 = p2;
    }
    
    // Get - P2:
    public Ponto getP2(){
        return this.p2;
    }
    
    // Set - P3:
    public void setP3(Ponto p3){
        this.p3 = p3;
    }
    
    // Get - P3:
    public Ponto getP3(){
        return this.p3;
    }
    
    // Preencher:
    public void preencher(){
        System.out.println("[PREENCHA OS PONTOS]:");
        System.out.println("Valores de X₁ e Y₁:");
        p1.preencher();
        System.out.println("Valores de X₂ e Y₂:");
        p2.preencher();
        System.out.println("Valores de X₃ e Y₃:");
        p3.preencher();
    }
    
    // Determinante:
    public double determinante(Ponto p2, Ponto p3){
        double esquerda = (this.p1.getX() * p2.getY() * 1) + (p2.getX() * p3.getY() * 1) + (this.p1.getY() * 1 * p3.getX());
        double direita = (p3.getX() * p2.getY() * 1) + (p2.getX() * this.p1.getY() * 1) + (p3.getY() * 1 * this.p1.getX());
        double det = esquerda - direita;
        return det;
    }
    
    // Colinearidade:
    public void colinearidade(){
        System.out.println("[VERIFICAÇÃO COLINEAR]:");
        if(this.determinante(this.p2, this.p3) == 0){
            System.out.print ("> São colineares. \n");
        }else{
            System.out.print ("> Não são colineares. \n");
        }
    }
    
    // Área:
    public void areaDoTriangulo(){
        System.out.println ("[ÁREA DO TRIANGULO]:");
        double det = this.determinante(this.p2, this.p3);
        double area = det/2;
        if (area < 0){
            System.out.print ( "> " + area*(-1) + "\n");
        }else{
            System.out.print ( "> " + area + "\n");
        }
    }
    
    // Perímetro:
    public void perimetroDoTriangulo(){
        System.out.println("[PERÍMETRO DO TRIANGULO]: ");
        double perimetro = this.p1.distancia(this.p2) + this.p2.distancia(this.p3) + this.p3.distancia(this.p1);
        System.out.print("> " + perimetro + "\n");
    }
    
    // Tipo:
    public void tipoDoTriangulo(){
        System.out.println("[TIPO DO TRIANGULO]: ");
        double lado1 = p1.distancia(p2);
        double lado2 = p2.distancia(p3);
        double lado3 = p3.distancia(p1);
        if ((lado1 == lado2) && (lado2 == lado3)){
            System.out.print("> Equilátero \n");
        }else{
            if((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)){
                System.out.print("> Isósceles \n");
            }else{
                System.out.print("> Escaleno \n");
            }
        }
    }
}
