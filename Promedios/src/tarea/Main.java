
package tarea;

import javax.swing.*;

public class Main
{

    public static void main(String[] args) {

        double tarea1;
        double tarea2;
        double tarea3;
        double tarea4;
        double tarea5;


        double b;
        double c;
        do {
            tarea1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese primera tarea academica: "));
            }

            while(tarea1 > 20);
        do {
            tarea2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese segunda tarea academica: "));
            }

        while(tarea2 > 20);

        do {
            tarea3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tercera tarea academica: "));
            }

        while(tarea3 > 20);

        do {
            tarea4 = Double.parseDouble(JOptionPane.showInputDialog("ingrese cuarta tarea academica: "));
            }

        while(tarea4 > 20);

        do {
            tarea5 = Double.parseDouble(JOptionPane.showInputDialog("ingrese quintatarea academica: "));
        }

        while(tarea5 > 20);

        do {
            b = Double.parseDouble(JOptionPane.showInputDialog("ingrese examen de medio curso: "));
        }

        while(b > 20);
        do {
            c = Double.parseDouble(JOptionPane.showInputDialog("ingrese examen de final de curso: "));
        }

        while(c > 20);

            Promedio promedio = new Promedio(b, c, tarea1, tarea2, tarea3, tarea4, tarea5);
            promedio.getOperacion1();
                System.out.println("El promedio de TA: " + promedio.getOperacion2());
                System.out.println("Examen de Medio Curso: " + b);
                System.out.println("Examen Final: " + c);
                System.out.println("El promedio final es: " + promedio.getOperacion1());


        }
    }
