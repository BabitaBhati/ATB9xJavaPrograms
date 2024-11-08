package OOps.OverloadingMethod;

public class Task1 {
   int a=10,b=8;

    public void add(){
        System.out.println("Add :"+(a+b));
    }
    //MethodOverloading(Same name but different parameters)
    public void sub(int c, int d){
        System.out.println("Sub :"+(c-d));
    }
}
