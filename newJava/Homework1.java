package newJava;

public class Homework1 {


    void test (int a){

        for (int i = 5; i > a; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.println(" *");
            }
        }
        for (int i = 5; i > a; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i > a; i--) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 5; i > a; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print(" *");
            }

            System.out.println();
        }
        for (int i = 1; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    }
