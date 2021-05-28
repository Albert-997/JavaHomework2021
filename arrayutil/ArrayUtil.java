package arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
//        double[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
//        double sum = 0;
//        for (int i = 0; i < array.length; i++) {
//
//            sum =sum+ array[i];
//
//        }
//        System.out.println("sum"+sum);
//        System.out.println(" MIJIN TVABANAKAN=" + sum/ array.length);
//
        int[] array = {5, 88, 47, 68, 87, 44,44, 59, 12};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {

                }

            }
            System.out.print(array[i] + " ");
        }


    }

}




