package OOps.Encapsulation.Example2;

public class Task1 {

    private int Rollno;
    public String Grade;

    //Parameters constructor
    public Task1(int Rollno){
        this.Rollno = Rollno;
    }


    //Protected encap...
    protected void Study(){
        System.out.println("Yes, You can do it!!");
    }

}
