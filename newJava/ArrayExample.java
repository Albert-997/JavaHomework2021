package newJava;

public class ArrayExample {

    public static void main(String[] args) {


        int[] array = {21, 7, 53, 100, 82, 44, 100, 97, 61, 72};

        int x = 44;
        boolean is = false;

        // 1-Ին խնդիր
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                is = true;
                break;
            }
        }
        System.out.println(is);

        // 2-րդ խնդիր
        int result = -1;


        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                result = i;
                break;
            }

        }
        System.out.println(result);

        // 3-րդ խնդիր

        int index = 2;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                System.out.println(array[i]);
            }
        }

        //4-րդ խնդիր

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " -րդ թիվը կրկնվում է");
                }
            }
        }


        // 5-րդ(6-րդ) խնդիր
        int fromSmall;
        int fromTheBig;
        for (int i = 0; i < array.length; i++) {
            fromSmall = array[i];
            for (int j = i - 1; j >= 0; j--) {
                fromTheBig = array[j];

                if (fromSmall < fromTheBig){
//                if (fromSmall > fromTheBig)
                    array[j + 1] = fromTheBig;
                    array[j] = fromSmall;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


