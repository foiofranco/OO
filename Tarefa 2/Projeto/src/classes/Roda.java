package classes;

import java.util.Scanner;

public class Roda {
    private double raio;
    private String material;
    private double peso;
    private double suporteMax;
    
    // Construtor:
    public Roda(){
        this.raio = 0.0;
        this.material = " ";
        this.peso = 0.0;
        this.suporteMax = 0.0;
    }

    // Set - Raio:
    public void setRaio(double raio){
        this.raio = raio;
    }

    // Get - Raio:
    public double getRaio(){
        return this.raio;
    }

    // Set - Material:
    public void setMaterial(String material){
        this.material = material;
    }

    // Get - Material:
    public String getMaterial(){
        return this.material;
    }

    // Set - Peso:
    public void setPeso(double peso){
        this.peso = peso;
    }

    // Get - Peso:
    public double getPeso(){
        return this.peso;
    }

    // Set - Suporte Máximo:
    public void setSuporteMax(double suporteMax){
        this.suporteMax = suporteMax;
    }

    // Get - Suporte Máximo:
    public double getSuporteMax(){
        return this.suporteMax;
    }

    // Preencher:
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.print("- Informe o raio: \n > ");
        this.raio = ler.nextDouble();
        System.out.print("- Informe o material: \n > ");
        this.material = ler.next();
        System.out.print("- Informe o peso: \n > ");
        this.peso = ler.nextDouble();
        System.out.print("- Informe o suporte máximo de peso: \n > ");
        this.suporteMax = ler.nextDouble();
    }
    
    // Copiar:
    public void copiarRoda (Roda copia){
        this.raio = copia.getRaio();
        this.material = copia.getMaterial();
        this.peso = copia.getPeso();
        this.suporteMax = copia.getSuporteMax();
    }
    
    // Imprimir:
    public void imprimirRoda(){
        System.out.print("- Raio: " + (this.raio) + "\n");
        System.out.print("- Material: " + (this.material) + "\n");
        System.out.print("- Peso: " + (this.peso) + "\n");
        System.out.print("- Suporte Máximo: " + (this.suporteMax) + "\n");
    }
}
