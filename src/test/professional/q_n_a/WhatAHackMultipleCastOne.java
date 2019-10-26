package test.professional.q_n_a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class WhatAHackMultipleCastOne {
    public static void main(String[] args) {
        //String s = (Comparator<String> & Serializable & Cloneable) ;
        new ArrayList<String>().removeIf(e -> e.contains("d"));
    }
}
