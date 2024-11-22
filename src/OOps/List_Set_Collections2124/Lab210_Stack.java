package OOps.List_Set_Collections2124;

import java.util.Stack;

public class Lab210_Stack {
    public static void main(String[] args) {
        Stack st=new Stack();

        st.add(12);
        st.add(11);
        st.add(14);
        st.add(99);
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.empty());
        System.out.println(st.add(0));
        System.out.println(st);
        st.add(77);
        st.push(55);
        System.out.println(st);
        st.add(1,97);
        System.out.println(st.get(0));
        System.out.println(st.get(1));
        System.out.println(st);
    }
}
