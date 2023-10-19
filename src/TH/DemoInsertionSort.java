package TH;

public class DemoInsertionSort {
    public static void main(String[] args) {
        int[] a = {6,8,5,1,2,3,7,9};

        for (int i = 0; i < a.length; i++) {
            int currentElement = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > currentElement; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = currentElement;
        }
    }
}
