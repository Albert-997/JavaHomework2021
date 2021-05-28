package newJava;

public class CharArrayExample {

    public static void main(String[] args) {

        // 1-ին խնդիր
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};

        int beg = 0;
        int end = text.length - 1;
        while (beg < end && text[beg] == ' ') {
            beg++;
        }
        while (beg < end && text[end] == ' ') {
            end--;
        }

        char[] result = new char[(end - beg) + 1];
        int index = 0;
        for (int i = beg; i < end + 1; i++) {
            result[index++] = text[i];
        }

        for (char value : result) {
            System.out.print(value);
        }

        System.out.println();

        // 2-րդ խնդիր


        char c = 'o';
        int quantity = 0;
        for (int i : bolola) {
            if (i == c) {
                quantity++;
            }
        }
        System.out.println(quantity);

        // 3-րդ խնդիր

        System.out.println(bolola[bolola.length / 2 - 1] + " " + bolola[bolola.length / 2]);


        // 4-րդ խնդիր

        boolean b = false;
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            b = true;
        }
        System.out.println(b);


        //5-րդ խնդիր

        boolean bob = false;
        for (int i = 0; i < babola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                bob = true;
            }

        }
        System.out.println(bob);


    }
}
