import org.junit.jupiter.engine.discovery.predicates.IsNestedTestClass;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; 1 <= 6; i++) {
            System.out.print("Enter number");
        int userInput = input.nextInt();
            switch (userInput) {

                case 90:
                    System.out.println("A");
                    break;
                case 60:
                    System.out.println("B");
                    break;
                case 50:
                    System.out.println("C");
                    break;
                case 40:
                    System.out.println("D");
                    break;
                case 30:
                    System.out.println("E");
                    break;
                case 20:
                    System.out.println("F");
                    break;
            }
        }

    }
}


