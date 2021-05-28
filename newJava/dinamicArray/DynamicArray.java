package newJava.dinamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size;


    public void addjoin(int value) {

        if (size == array.length) {
            expand();
        }
        array[size++] = value;
    }

    private void expand() {
        int[] arraynew = new int[array.length + 10];
        System.arraycopy(array, 0, arraynew, 0, array.length);
        array = arraynew;
    }


    public int getByIndex(int index) {
        if (index <= array.length) {
            return array[index];
        } else {
            return -1;
        }
    }

    public void printMethod() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void printMethodSecond() {
        for (int i = 0; i < size - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int maximum() {
        int maximum = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    public int minimum() {
        int minimum = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public void deleteIndex(int index) {
        for (int i = size - 1; i > index; i--) {
            int com = array[size - 1];
            System.arraycopy(array, 0, array, 1, size - 1);
            array[0] = com;

        }
    }

    public void deleteValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteIndex(i);
                i = 0;
                size--;
            }
        }
    }

    public void deleteValueSecond(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteIndex(i);
                size--;
                break;
            }
        }
    }


    public int[] subArray(int begIndex, int finalityIndex) {
        int[] subArray = array;
        for (int j = begIndex; j <= finalityIndex; j++) {
            System.out.print(subArray[j] + " ");
        }
        System.out.println();
        return subArray;
    }

    public int[] subArray(int originIndex) {
        int[] subArray = array;
        for (int j = originIndex; j < size; j++) {
            System.out.print(subArray[j] + " ");
        }
        System.out.println();
        return subArray;
    }
}