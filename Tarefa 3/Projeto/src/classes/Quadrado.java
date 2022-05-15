package classes;

import classes.Ponto;

public class Quadrado {
    Ponto p1, p2, p3, p4;
    double lados; 
    
    // Construtor:
    public Quadrado(){
        this.p1 = new Ponto();
        this.p2 = new Ponto();
        this.p3 = new Ponto();
        this.p4 = new Ponto();
        this.lados = 0.0;
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
    
    // Set - P4:
    public void setP4(Ponto p4){
        this.p4 = p4;
    }
    
    // Get - P4:
    public Ponto getP4(){
        return this.p4;
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
        System.out.println("Valores de X₄ e Y₄:");
        p4.preencher();
    }
    
    // Verificação:
    public boolean Quadrado(){
        double aux[] = {this.p1.distancia(this.p2),this.p2.distancia(this.p3),this.p3.distancia(this.p4),this.p3.distancia(this.p1), this.p4.distancia(this.p1),this.p4.distancia(this.p2)};
        int contLados = 1;
        int contDiagonal = 0;
        for(int i = 1; i <= 5; i++){
            if(aux[0] == aux[i]){
                contLados++;
            }else{
                contDiagonal++;
            }
        }
        // Valor - Lados:
        if(contLados == 4){
            lados = aux[0];
        }else{
            lados = aux[1];
        }
        // Verificação:
        if((contLados == 4) && (contDiagonal == 2) || (contLados == 2) && (contDiagonal == 4)){
            return true;
        }else{
            return false;
        }
    }
    
    // Imprimir - Verificação:
    public void imprimirVerificacao(){
        System.out.println("[QUADRADO]:");
        if (Quadrado() == true){
            System.out.print("> Sim \n");
        }else{
            System.out.print("> Não \n");
        }
    }
    
    // Área:
    public void areaDoQuadrado(){
        System.out.println("[ÁREA]:");
        if(Quadrado() == true){
            double area = Math.pow(lados, 2);
            System.out.print("> " + area + "\n");
        }
    }
    
    // Perímetro:
    public void perimetroDoQuadrado(){
        System.out.println("[PERÍMETRO]:");
        if(Quadrado() == true){
            double perimetro = lados*4;
            System.out.print("> " + perimetro + "\n");
        }
    }
    
}
