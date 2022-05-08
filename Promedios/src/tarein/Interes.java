package tarein;



public class Interes {

    private double capital;
    private double inte;
    private double periodo;

    private Math math;




    public Interes(double capital, double inte,double periodo) {

        this.capital = capital;
        this.inte = inte;
        this.periodo = periodo;

    }


    public double getCapital() {
        return capital;
    }

    public double getInte() {
        return inte;
    }

    public double getPeriodo() {
        return periodo;
    }





    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setInte(double inte) {
        this.inte = inte;
    }

    public void setPeriodo(double periodo) { this.periodo = periodo;}



    double operacion1() {
        double operacion1;
        operacion1 = math.pow((capital*(1+inte)),periodo);
        return operacion1;

    }


}