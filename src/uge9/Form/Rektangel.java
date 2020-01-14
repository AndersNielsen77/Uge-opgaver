package uge9.Form;

public class Rektangel implements Form {
    private double a;
    private double b;

    public Rektangel(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double omkreds() {
        return 2*(a+b);
    }

    public double areal() {
        return a*b;
    }
    public boolean equals(Object o){
        if (o instanceof Form){
            if ((omkreds()==((Rektangel) o).omkreds())&&(areal()==((Rektangel) o).areal()))
                return true;
        }
        return false;
    }
}
