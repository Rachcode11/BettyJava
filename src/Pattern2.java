public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for(int row =1; row <= n; row++){
            for(int spaces =0; spaces < n - row; spaces++){
                System.out.print(" ");
            }for(int col = row; col>= 1; col--){
                System.out.print(row);
            }
            for(int col = 2; col <= row; col++){
                System.out.print(row);
            }
            System.out.println();


        }
    }
}