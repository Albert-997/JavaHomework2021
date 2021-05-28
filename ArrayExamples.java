public class ArrayExamples {
    public static void main(String[] args) {
        //1.  Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ, որը մեզ կտպի 44 թվի ինդեքսը մասիվի մեջ եթե կա, եթե չկա -1 կտպի։
//        int[] array = {5, 88, 47, 68, 87,44, 59, 12, 72, 91};
//        int x = 44;
//        int b = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x) {
//           b=i;
//            }
//
//        }
//        System.out.println(b);

        //2 Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ, որը մեզ կտպի true եթե նշված թիվը կա վերևի մասիվի մեջ, եթե չկա false:
//        int[] array = {5, 88, 47, 68, 87, 44, 59, 12, 72, 91};
//        int x = 44;
//        boolean b = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x) {
//                b = true;
//            }
//
//        }
//        System.out.println(b);


        // 3 Սորտավորենք մեր ունեցած մասիվը փոքրից մեծ։
//        int[] array = {5, 88, 47, 68, 87, 44, 59, 12, 72, 91};
//        int k;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] < array[i]) {
//                    k = array[i];
//                    array[i] = array[j];
//                    array[j] = k;
//                }
//            }
//            System.out.print(array[i] + " ");
        //    }

        // 4 Սորտավորենք մեր ունեցած մասիվը մեծից փոքր։
//
//        int[] array = {5, 88, 47, 68, 87, 44, 59, 12, 72, 91};
//        int k;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] > array[i]) {
//                    k = array[i];
//                    array[i] = array[j];
//                    array[j] = k;
//                }
//            }
//            System.out.print(array[i] + " ");
//        }

        //  5 Գրեք կոդ, որը կգտնի մասիվի մեջի կրկնվող էլեմենտները, ու կտպի որ օրինակ 3-ը կրկնվում է։

//        int[] array = {5, 88, 47, 68, 87, 44, 59, 12,12, 72, 91};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    System.out.print(array[i] + " ");
//
//                }
//
//            }

//        }

// 6 Ունենք թիվ, օրինակ՝ int index = 4; ներքևում պետք է գրենք կոդ, որը կտպի տրված index - ինդեքսի մեջի արժեքը։

//        int[] array = {5, 88, 47, 68, 87, 44, 59, 12,12, 72, 91};
//        int index=4;
//        for (int i = 0; i < array.length; i++) {
//
//
//        }
//        System.out.println(array[4]);
    }

}
