public class InitArray {
    public static void main(String[] args) {
        ade();
        rach();
      int[] array = new int[10];
       System.out.printf("%s%8s%n","index", "Value");
        for(int counter = 0; counter < array.length; counter++){
        System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
    static void rach(){
       int[] array = {32, 27, 64, 18, 95, 14, 19, 70, 60, 37};
        System.out.printf("%s%8s%n", "index", "value");

        for(int counter = 0; counter < array.length; counter++){System.out.printf("%5d%8d%n", counter, array[counter] );


        }


        }
    static void ade(){
        final int array_length = 10;
        int[] array = new int[array_length];
        for(int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }
        System.out.printf("%s%8s%n", "index", "value");
        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }

    }
    static void goke(){

        int [][] array1 = {{1,2,3,},{4,5,6}};
        int [][] array2 = {{1,2,3},{4,5,6}};
        System.out.println(array1);
        System.out.println("Value in array1 by row are");


        }


    }


