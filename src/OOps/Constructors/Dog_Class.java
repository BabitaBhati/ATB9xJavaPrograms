package OOps.Constructors;

public class Dog_Class {
    String Dog_name;
    int age;
    Double weight;
    Double height;
    String color;

    //Default constructor
    public Dog_Class(){
        System.out.println("Default Constructor");
    }
    //Parameterized constructor
    public Dog_Class(String DOg_name,int age,Double weight,Double height,String color){
        String Dog_Class;
        this.Dog_name=DOg_name;
        this.age=age;
        this.color=color;
        this.height=height;
        this.weight=weight;
    }

    public void displayInfo(){
        System.out.println("Dog Name : "+ Dog_name);
        System.out.println("DOg Weight : " +weight);
        System.out.println("Dog Height : " +height);
        System.out.println("Dog Color : " +color);
    }
}
