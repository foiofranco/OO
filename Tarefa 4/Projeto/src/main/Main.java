package main;

import classes.Disciplina;
import gui.FrProfessor;

public class Main {

    public static void main(String[] args) {
        Disciplina OO = new Disciplina();
        OO.preencher();
        OO.imprimir();
        FrProfessor tela1 = new FrProfessor();
        tela1.setVisible(true);
    }
    
}
