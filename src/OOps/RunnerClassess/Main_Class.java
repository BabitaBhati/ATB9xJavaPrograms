package OOps.RunnerClassess;

import OOps.Constructors.Dog_Class;

public class Main_Class {
    public static void main(String[] args) {
     Dog_Class d1=new Dog_Class("Tom",12,9.9,2.1,"Brown");
     Dog_Class d2=new Dog_Class();

     /*d1.DOg_name="Tom";
     d1.weight=20.2;
     d1.age=12;
     d1.color="brown";
     d1.height=3.2;*/

        d1.displayInfo();
    }
}
