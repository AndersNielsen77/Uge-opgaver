package uge10.dato;

public class Dato implements Comparable < Dato > {
    private int year;
    private int month;
    private int day;

    public Dato(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int compareTo(Dato other){
        if (year != other.year){
            return year - other.year;
        } else if (month != other.month){
            return month - other.month;
        } else {
            return day - other.day;
        }
    }

    @Override
    public String toString() {
        return day + "/"+ month + " " + year;
    }

}



