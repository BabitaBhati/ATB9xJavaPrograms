package Oct.ex_2810_String;

import java.sql.SQLOutput;

public class Lab_28 {
    public static void main(String[] args) {
        String s1="Babita";//creating string by Java string literal
           //1 char -Returns the char value according to index
           char c=s1.charAt(4);
           System.out.println(c);
           //find the length of the string
           System.out.println("Length of the String: "+ s1.length());
           //combine the string
           s1=s1.concat("chauhan");
           System.out.println(s1);
           //using conatins that is seq of char to be searched
           String s2="Hello World";
           System.out.println(s2.contains("Hello"));
           System.out.println(s2.contains("hi"));
           //equals compare the string that is equal or not
           String s3="Babita";
           String s4="Babita";
           System.out.println(s3.equals(s4));//true
           System.out.println(s3.equals(s2));//flase
           //equalsIgnorecase compare two string irrespective inupper and lower case
           String s5="babita";
           System.out.println(s3.equalsIgnoreCase(s5));
           System.out.println(s5.equalsIgnoreCase(s2));
           //indexof returns the spesific char of occurence of string
           System.out.println(s5.indexOf('i'));
           //length returns the length of the string
           System.out.println("Length of the String: "+ s5.length());
           //Replace returns new string after replace old string
           String rep=s1.replace("a","b");
        System.out.println("Print Replace string:" +rep);
           /*char ch[]={'s','t','r','i','n','g','s'};//char array
           String s2=new String(ch);//converting char array to string
           String s3=new String("Himanshu" );//creating Java string by new keyword
           System.out.println(s1);
           System.out.println(s2);
           System.out.println(s3);
*/

        }
}

