package b_01_06;
public class SmallestNumber {

   static void func(){
        int []MyArray={15,10,45,0,11,-3};
        int x = MyArray[0];
        for (int element : MyArray) {
            if (element < x) {
                x = element;
            }

        }System.out.println(x);
    }

    public static void main(String[]arg){
      func();


    }
}

