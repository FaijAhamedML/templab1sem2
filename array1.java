package Lab1;

public class array1 {
    static void main(String[] args) {
        int[] A= new int[5];
        A[0]=10;
        A[1]=20;
        A[2]=30;
        A[3]=40;
        A[4]=50;

        int[] B= {34,67,12,89,12};

        int[] C= new int[5];

        for(int i=0; i<C.length; i++){
            C[i]= A[i]+B[i];
        }
        System.out.print("Array C:[ ");
        for(int j=0; j<C.length; j++){
            System.out.print(C[j]);
            if (j!=4){
            System.out.print(", ");
        }
        }
        System.out.println("]");
    }
}
