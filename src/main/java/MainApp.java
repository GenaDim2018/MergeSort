import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int [] arr = new int[7];
        Sorter sorter = new Sorter();
        arr = fillArray(arr);
        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(arr));
        sorter.sort(arr, 2, arr.length-1);
        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(arr));
    }
    public static int[] fillArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*31);
        }
        return arr;
    }
}
