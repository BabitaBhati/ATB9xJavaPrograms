package OOps.ToString;

public class Studentarray {
    int rollno;
    String Name,Address;

   //Constructor
    public Studentarray(int rollno,String Name,String Address){
        this.rollno=rollno;
        this.Name=Name;
        this.Address=Address;

    }
    // Used to print student details
    public String toString(){
        return this.rollno+" "+this.Name+""+ this.Address;
    }
}
