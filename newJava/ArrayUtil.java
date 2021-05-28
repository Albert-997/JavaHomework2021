package homework;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {21, 7, 53, 100, 8, 82, 11, 97, 61, 72};
        int max = array[0];
        int min = array[0];
        int zuyg;
        int kent;
        int zuygResult = 0;
        int kentResult = 0;
        int result = 0;
        double resultMijin = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\n" + max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                zuyg = array[i];
                System.out.print(zuyg + " ");
            }

        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                kent = array[i];
                System.out.print(kent + " ");
            }

        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                zuygResult++;
            }

        }
        System.out.println(zuygResult);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                kentResult++;
            }

        }
        System.out.println(kentResult);

        for (int i = 0; i < array.length; i++) {
            resultMijin += array[i];
        }
        System.out.println(resultMijin / array.length);

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println(result);

    }
}
