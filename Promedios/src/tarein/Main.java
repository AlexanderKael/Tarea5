package tarein;


import tarein.Interes;

import javax.swing.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {

        double capital;
        double inte;
        double periodo;



            capital = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Capital: "));



            inte = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el interes en decimales: "));


            periodo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el periodo: "));

        Interes interes = new Interes(capital,inte,periodo);
        interes.operacion1();
        JOptionPane.showMessageDialog(null, "El interes compuesto es: "+ interes.operacion1());


    }
}
