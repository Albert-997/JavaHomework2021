package newJava.dinamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addjoin(6);
        dynamicArray.addjoin(10);
        dynamicArray.addjoin(33);
        dynamicArray.addjoin(71);
        dynamicArray.addjoin(98);
        dynamicArray.addjoin(11);
        dynamicArray.addjoin(82);
        dynamicArray.addjoin(8);
        dynamicArray.addjoin(40);
        dynamicArray.addjoin(62);
        dynamicArray.addjoin(125);
        dynamicArray.addjoin(222);
        dynamicArray.addjoin(795);
        dynamicArray.printMethod();
        dynamicArray.subArray(1, 3);
        dynamicArray.subArray(2);
        System.out.println("Նշված ինդեքսի արժեքը = " + dynamicArray.getByIndex(2));
        System.out.println("Մաքսիմում = " + dynamicArray.maximum());
        System.out.println("Մինիմում = " + dynamicArray.minimum());
        dynamicArray.deleteIndex(6);
        dynamicArray.printMethodSecond();
        dynamicArray.deleteValue(33);
        dynamicArray.printMethod();
        dynamicArray.deleteValueSecond(10);
        dynamicArray.printMethod();


    }
}