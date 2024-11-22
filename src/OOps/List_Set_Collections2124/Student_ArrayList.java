package OOps.List_Set_Collections2124;

public class Student_ArrayList {
    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    private String rollnumber;

        public Student_ArrayList(String name,String rollnumber){
            this.name=name;
            this.rollnumber=rollnumber;
        }

        public void studentDetails(){
            System.out.println("Student name: "+this.name);
            System.out.println("Student rollnumber: "+this.rollnumber);
        }
}
