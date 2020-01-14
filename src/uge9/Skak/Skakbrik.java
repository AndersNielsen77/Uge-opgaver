package uge9.Skak;

import java.awt.*;

public abstract class Skakbrik extends Point {

    public Skakbrik(){
    indefor();
    }
    public void indefor(){
        if (x < 0 || y < 0){
            throw new IllegalArgumentException("Ikke inde for fæltet");
        }
        if (x > 7 || y > 8){
            throw new IllegalArgumentException("Ikke inde for fæltet");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

