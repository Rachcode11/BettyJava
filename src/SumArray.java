public class SumArray {
    public static void main(String[] args) {
        rach();
        ade();
        int[] array = {2,4,6,8,10,12,14,16};
        int total = 0;
        // enhance for
        for (int i : array) {
            total += i;

        }
        System.out.printf("Total of array elements: %d%n", total);
    }
    static void rach(){
        int[] array = {56,74,87,93};
        int total = 0;
        for(int counter = 0; counter < array.length; counter++){
           total += array[counter];
        }
        System.out.printf("Total of array elements: %d%n", total);
    } 
    static void ade(){
        int array = 0;

        int[] number = new int [5];
        number[0] = 10;
        number[1] = 6;
        number[2] = 8;
        number[3] = 4;
        number[4] = 7;
        for(int counter = 0; counter < number.length; counter++){

        }
        System.out.printf("Total of array elements: %5%n", number);


    }



    }



