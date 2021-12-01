package lesson11.hw11;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadaie1and2 {
    public static void main(String[] args) {



    /*  1.Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        2.Написать метод, который преобразует массив в ArrayList;*/

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

        String[] arrayOfStrings = {"A", "B", "C"};
        convertList(arrayOfStrings);


    }


    public static <T> void swap(T[] array, int n1, int n2) {
        T sw = array[n1];
        array[n1] = array[n2];
        array[n2] = sw;

    }

    public static <T> void convertList(T[] arr){

        ArrayList<T> array = new ArrayList<>(Arrays.asList(arr));
        System.out.println(array);
    }

}



