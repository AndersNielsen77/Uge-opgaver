package uge9.Form;

public class Cirkel implements Form{
    private double r;

    public Cirkel(double r){
        this.r = r;
    }

    public double omkreds() {
        return 2*r*Math.PI;
    }

    public double areal() {
        return Math.PI * r * r;
    }

    //public int compareTo(Cirkel anden)
    //double andenradius = anden.r;
    //if(r == andenradius){
    //retrun true;
    //}
    public boolean equals(Object o){
        if (o instanceof Form){
            if (r==((Cirkel) o).r)
               return true;
        }
        return false;
    }
}
