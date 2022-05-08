package main;

import classes.Carro;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        c1.preencher();
        c2.copiarCarro(c1);
        c2.imprimirCarro();
    }
    
}
