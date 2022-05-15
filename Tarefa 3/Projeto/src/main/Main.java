package main;

import classes.Triangulo;
import classes.Quadrado;

public class Main {
    public static void main(String[] args) {
        // Instância - Triangulo:
        Triangulo t1 = new Triangulo();
        Quadrado q1 = new Quadrado();
        
        // Título - Triângulo:
        System.out.println("=====[TRIÂNGULO]=====");
        
        // Preencher - Triângulo:
        t1.preencher();
        
        // Colinearidade - Triângulo:
        t1.colinearidade();
        
        // Area - Triângulo:
        t1.areaDoTriangulo();
        
        // Perímetro - Triângulo:
        t1.perimetroDoTriangulo();
        
        // Tipo - Triângulo:
        t1.tipoDoTriangulo();
        
        // Título - Quadrado:
       System.out.println("\n =====[QUADRADO]=====");
       
       // Preencher - Quadrado:
       q1.preencher();
       
       // Verificação - Quadrado:
       q1.imprimirVerificacao();
       
       // Area - Quadrado:
       q1.areaDoQuadrado();
       
       // Perimetro - Quadrado:
       q1.perimetroDoQuadrado();
    }
}
