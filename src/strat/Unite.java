package strat;

import java.util.ArrayList;

public class Unite {
    private ArrayList<Deplacement> dp=new ArrayList<Deplacement>();
    private ArrayList<Attaque> at=new ArrayList<Attaque>();
    private int a;
    public Unite(ArrayList<Deplacement> dp,int a) {
        this.a=a;
        this.dp = dp;
    }

    public Unite(ArrayList<Attaque> at) {
        this.at = at;
    }

    public void seDeplacer()
    {

       this.dp.forEach(x->x.deplacer());
    }

    public void combattre()
    {
        this.at.forEach(x->x.attaquer());

    }
}
