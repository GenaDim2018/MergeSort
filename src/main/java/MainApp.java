import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Sorter sorter = new Sorter();
        fillArray(arr);
        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(arr));
        sorter.sort(arr, 0, arr.length - 1);
        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 31);
        }
    }
}
