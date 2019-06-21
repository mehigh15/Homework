package b_01_06;

public class Sum {

     static void addition(int m, int n) {
        int p=0;
        while (m<n){
            p = m+p;

            m++;
        }
        System.out.println(p);

    }

    public static void main(String[]args){

       addition(1,100);
    }

}



