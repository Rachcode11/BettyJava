import java.util.Scanner;

public class PatternA {
    public static void main(String[] args) {
       pattern1(1);
        pattern2(2);
        pattern3(3);
        pattern4(4);
    }
    static void pattern1(int n){
        int a = 1;
        while(a <= 6 )
        {
            int b = 1;
            while(b <= a)
            {
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
            a++;
        }
    }

    static void pattern2(int n){
        int a = 1, b, c, num1 = 7, num2 = 7, num = 0;
        while(a <= num1)
        {
            c = 1;
            while(c < num1 - (num1 - a))
            {
                System.out.print(" ");
                c++;
            }
            num = num2 - a;
            b = 1;
            while(b <= num)
            {
                System.out.print(num1 - (num1 - b));
                b++;
            }
            a++;
            System.out.println(" ");
        }

    }
    static void pattern3(int n){
        int i=1;
        int j=1;
        int k=1;
        int m1=7;
        while(i<m1){
            k=1;
            while(k<m1-i){
                System.out.print(' ');
                k++;
            }
            while(j>0){
                System.out.print(m1-(m1-j));
                j--;
            }
            i++;
            j+=i;
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    static void pattern4(int n){
        int i=1,j,k,m1=10,m2=10,num=0;
        while(i<=m1){
            k=1;
            while(k<m1-(m1-i)){
                System.out.print(" ");
                k++;
            }
            num=m2-i;
            j=1;
            while(j<=num){
                System.out.print(m1-(m1-j));
                j++;
            }
            i++;
            System.out.println(" ");
        }
    }
}











