package tarea;


public class Promedio {

    private double b;
    private double c;
    private double tarea1;
    private double tarea2;
    private double tarea3;
    private double tarea4;
    private double tarea5;


    public Promedio(double b, double c,double tarea1,double tarea2, double tarea3, double tarea4, double tarea5) {
        this.setB(b);
        this.setC(c);
        this.setTarea1(tarea1);
        this.setTarea2(tarea2);
        this.setTarea3(tarea3);
        this.setTarea4(tarea4);
        this.setTarea5(tarea5);
    }


    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getTarea1() {
        return tarea1;
    }

    public double getTarea2() {
        return tarea2;
    }

    public double getTarea3() {
        return tarea3;
    }

    public double getTarea4() {
        return tarea4;
    }

    public double getTarea5() {
        return tarea5;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setTarea1(double tarea1) {
        this.tarea1 = tarea1;
    }

    public void setTarea2(double tarea2) {
        this.tarea2 = tarea2;
    }

    public void setTarea3(double tarea3) {
        this.tarea3 = tarea3;
    }

    public void setTarea4(double tarea4) {
        this.tarea4 = tarea4;
    }

    public void setTarea5(double tarea5) {
        this.tarea5 = tarea5;
    }

    double getOperacion1() {
        double operacion1;
        operacion1 = (getOperacion2()+getB()+getC())/3;
        return operacion1;

    }
    double getOperacion2(){
        double operacion2;
        operacion2=(getTarea1()+getTarea2()+getTarea3()+getTarea4()+getTarea5())/5;
        return operacion2;
    }


    }
