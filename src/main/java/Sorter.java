public class Sorter {
    public void sort(int[] arr, int p, int r) {
        if (p >= r) return;
        int q = (p + r) / 2;
        sort(arr, p, q);
        sort(arr, q + 1, r);
        merge(arr, p, q, r);
    }

    public void merge(int[] arr, int p, int q, int r) {
        int[] leftArr = new int[q - p + 1];
        int[] rightArr = new int[r - q];
        System.arraycopy(arr, p, leftArr, 0, leftArr.length);
        System.arraycopy(arr, q + 1, rightArr, 0, rightArr.length);
        int i = 0, j = 0, k = p;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
