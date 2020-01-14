package uge9.Form;

public class Kvadrat implements Form{
    private double a;

    public Kvadrat(double a){
    this.a = a;
    }

    public double omkreds() {
        return 4*a;
    }

    public double areal() {
        return a*a;
    }
    public boolean equals(Object o){
        if (o instanceof Form){
            if (a==((Kvadrat) o).a)
                return true;
        }
        return false;
    }
}
