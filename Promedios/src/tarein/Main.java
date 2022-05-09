package tarein;

import javax.swing.*;

public class    Main
{

    public static void main(String[] args) {

        double a;
        double b;
        double c;

            a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Capital: "));



            b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el interes en decimales: "));


            c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el periodo: "));

        Interes interes = new Interes(a,b,c);
        interes.getOperacion1();
        JOptionPane.showMessageDialog(null, "El interes compuesto es: "+ interes.getOperacion1());


    }
}
