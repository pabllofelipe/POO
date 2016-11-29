/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calc;

import javax.swing.JOptionPane;

/**
 *
 * @author Pabllo
 */
public class Calculadora { 

    public static void main(String[] args) {
        
        int x, y;
        double m;
        String sX, sY, sM;

        sX = JOptionPane.showInputDialog(null, "Digite o primeiro nÃºmero:",
                "Primeiro nÃºmero", JOptionPane.QUESTION_MESSAGE);

        x = Integer.parseInt(sX);

        sY = JOptionPane.showInputDialog(null, "Digite o segundo nÃºmero:",
                "Segundo nÃºmero", JOptionPane.QUESTION_MESSAGE);

        y = Integer.parseInt(sY);
        
        //sM = JOptionPane.showInputDialog(null, "Digite um numero:", "Numero", JOptionPane.QUESTION_MESSAGE);
        
        m = 2.0;
                //Double.parseDouble(sM);

        Operacoes calc = new Operacoes(x, y);

        JOptionPane.showMessageDialog(null, "somar: " + calc.somar());
        JOptionPane.showMessageDialog(null, "subtrair: " + calc.subtrair());
        JOptionPane.showMessageDialog(null, "multiplicar: " + calc.multiplicar());
        JOptionPane.showMessageDialog(null, "dividir: " + calc.dividir());
        JOptionPane.showMessageDialog(null, "fatorial:" + calc.fatorial());
        JOptionPane.showMessageDialog(null, "porcentagem:" + calc.porcentagem());
        JOptionPane.showMessageDialog(null, "raiz:" + calc.raiz());
        calc.fibonacci();

        System.exit(0);
        
    }
    
}
    
