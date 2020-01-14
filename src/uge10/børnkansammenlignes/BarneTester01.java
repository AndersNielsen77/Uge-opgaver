package uge10.børnkansammenlignes;

import java.util.Arrays;

public class BarneTester01 {
    public static void main(String[] args) {
        Barn[] boern = {new Barn("Alice",2015,2,2), new Barn("Bob",2004,12,24), new Barn("Cthulhu",2011,8,29)};
        System.out.println(Arrays.toString(boern));
        Arrays.sort(boern);
        System.out.println(Arrays.toString(boern));
    }
}