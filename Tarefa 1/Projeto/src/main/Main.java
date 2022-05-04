package main;

import classes.Ponto;

public class Main {
    public static void main(String[] args){
        // Pontos:
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        Ponto p3 = new Ponto();
        
        // Preencher p1 e p2:
        System.out.println("[DISTÂNCIA ENTRE DOIS PONTOS]:");
        System.out.println("Valores de X₁ e Y₁:");
        p1.preencher();
        System.out.println("Valores de X₂ e Y₂:");
        p2.preencher();
        
        // Distância entre dois pontos:
        double dist = p1.distancia(p2);
        System.out.print("[DISTÂNCIA ENTRE OS PONTOS" + p1 + " E " + p2 + "]: " + "\n" + "> " + dist + "\n" + "\n");
        
        // Preencher p3:
        System.out.println("[VERIFICAÇÃO COLINEAR]:");
        System.out.println("Valores de X₃ e Y₃:");
        p3.preencher();
        
        // Verificação colinear + area do triângulo:
        System.out.println("[RESULTADO]:");
        System.out.println(p1.areaDoTriangulo(p2, p3));
    }
}
