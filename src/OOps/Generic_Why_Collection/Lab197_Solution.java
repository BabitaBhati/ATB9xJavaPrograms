package OOps.Generic_Why_Collection;

public class Lab197_Solution {
    public static void main(String[] args) {
        temp_sum(23, 45);
        temp_sum("Pramod", "Dutta");
        temp_sum(true, false);
        // pramod -> any data Type.

    }

    public static <T> T temp_sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
    }

