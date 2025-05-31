package Cw_05_31;

interface IObwod{
    public double obwod();
}

interface IObszar{
    public double obszar();
}

public abstract class Figura implements IObszar,IObwod{
//    public abstract double obwod();
//    public abstract double obszar();
}

class Kwadrat extends Figura {
    public double a;
    public Kwadrat(int a){
        this.a = a;
    }

    @Override
    public double obwod() {
        return a * 4;
    }

    @Override
    public double obszar() {
        return Math.pow(a,2);
    }
}

class Kolo extends Figura{
    public double r;
    public Kolo(int r){
        this.r = r;
    }

    @Override
    public double obwod() {
        return 2 * r * Math.PI;
    }

    @Override
    public double obszar() {
        return Math.PI * r *r;
    }
}
