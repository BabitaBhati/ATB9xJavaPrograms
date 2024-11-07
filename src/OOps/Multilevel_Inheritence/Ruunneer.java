package OOps.Multilevel_Inheritence;

import OOps.Multiple_Inheritence.Father;

public class Ruunneer {
    public static void main(String[] args) {
        GrandFather g=new GrandFather();
        g.GF_Lands();
        g.Grandfather_Home();

        father f=new father();
        f.fHome();
        f.FLands();

        Child c=new Child();
        c.Son_Job();
        c.SonHome();

    }
}
