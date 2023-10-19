package TH;

public class DemoSelectionSort {
    public static void main(String[] args) {

        int[] a = {6,8,5,1,2,3,7,9};

        for (int i = 1; i < a.length; i++) {
            int indexOfMax = 0;

            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[indexOfMax]){
                    indexOfMax = j;
                }
            }
            int temp = a[a.length - i -1];
            a[a.length - i - 1] = a[indexOfMax];
            a[indexOfMax] = temp;
        }
    }
}
