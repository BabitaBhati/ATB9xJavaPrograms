package Oct.ex_291024_Array;

public class Lab_2910_duplicate {
    public static void main(String[] args) {
        int[] ar=new int[]{1,2,2,3,4,5,6,7,8,9};
        //System.out.println("Print duplicate values:"+ar);

        //search duplicate
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if (ar[i]==ar[j]){
                    System.out.println("Print duplicate array:"+ ar[j]);
                    //System.out.println(ar[i]);
                }
            }

        }
    }
}
