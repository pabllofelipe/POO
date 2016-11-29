package Calc;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Operacoes {
    
    private double valor1 = 0;
    private double valor2 = 0;
    private double resultado = 0;
    private double rs = 0.0;

    public Operacoes(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public double somar() {
        resultado = valor1 + valor2;
        return resultado;
    }

    public double subtrair() {
        resultado = valor1 - valor2;
        return resultado;
    }

    public double multiplicar() {
        resultado = valor1 * valor2;
        return resultado;
    }

    public double dividir() {
        resultado = valor1 / valor2;
        return resultado;
    }
    
     public double raiz(){
         rs = Math.sqrt(valor1);
         return rs;
     }
     
     public double porcentagem(){
         rs = (valor1*valor2)/100.0;
         return rs;
     }
     
     public double fatorial(){
         double x = valor1;
         resultado = x;
         
         while(x > 1){
             resultado = resultado * (x-1);
             x --;
         }
         
         return resultado;
     }
     
     public void fibonacci(){
         
         double x1 = 0, x2 = 1, x;
         
         JOptionPane.showMessageDialog(null, x1);
         JOptionPane.showMessageDialog(null, x2);
         while(valor1 >= x1+x2){
            JOptionPane.showMessageDialog(null, x1+x2);
            x = x1;
            x1 = x2;
            x2 = x + x2;
         }
     }
    
     
}
