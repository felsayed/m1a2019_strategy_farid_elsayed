package com.company;

import strat.Attaque;
import strat.Deplacement;
import strat.Unite;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {

        ArrayList<Deplacement>d=new ArrayList<Deplacement>();
        ArrayList<Attaque>a=new ArrayList<Attaque>();
        Unite soldat=new Unite(d,1);
        Unite chars=new Unite(a);
        Unite helicoptere=new Unite(a);
        soldat.combattre();
        chars.seDeplacer();
        helicoptere.seDeplacer();



    }
}
