package OOps.ToString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        Studentarray[] ar = {new Studentarray(1, "Raja: " ,  "Delhi"),
                new Studentarray(2, "Ram: "  , "Pune"),
                new Studentarray(3, "Usa: "  , "Noida"),
                new Studentarray(4, "Tina :" , "faridabad")};
        //Arrays.toString() is overloaded for array of Object class
        System.out.println(Arrays.toString(ar));
    }
}
