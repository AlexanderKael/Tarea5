package tarein;




public class Interes {

    private double capital;
    private double inte;
    private double periodo;

    private Math math;




    public Interes(double capital, double inte,double periodo) {

        this.setCapital(capital);
        this.setInte(inte);
        this.setPeriodo(periodo);

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



    double getOperacion1() {
        double operacion1;
        operacion1 = math.pow((getCapital()*(1+getInte())),getPeriodo());
        return operacion1;

    }


}